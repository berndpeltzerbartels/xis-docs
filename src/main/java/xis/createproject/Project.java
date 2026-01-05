package xis.createproject;


import lombok.Data;
import one.xis.validation.Mandatory;

@Data
class Project {

    @Mandatory
    private String groupId;

    @Mandatory
    private String artifactId;

    @Mandatory
    private String version;
}
