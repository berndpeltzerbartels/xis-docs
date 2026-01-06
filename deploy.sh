#/bin/bash

# Deploy script for the application
echo "Starting deployment..."

./gradlew clean build
if [ $? -ne 0 ]; then
    echo "Build failed. Exiting deployment."
    exit 1
fi
echo "Build successful."

./gradlew runnableJar
if [ $? -ne 0 ]; then
    echo "Jar creation failed. Exiting deployment."
    exit 1
fi
echo "Jar created successfully."

mv build/libs/*-runnable.jar build/libs/xis-docs.jar

sftp bernd@xis.one <<EOF
put build/libs/xis-docs.jar
bye
EOF

ssh bernd@xis.one <<EOF
mv /home/bernd/xis-docs.jar /opt/xis/xis-docs.jar
sudo systemctl restart xis-docs
EOF