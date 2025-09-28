package one.xis.boot;

public final class Runner {
  private Runner() {}
  public static void main(String[] args) {
    one.xis.boot.XISBootRunner.run(docs.Main.class, args);
  }
}
