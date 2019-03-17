package de.userstudy.target1;

public class Target {

  String data;

  public static void main(String[] args) {
    Target target = new Target();
    Target anotherTarget = new Target();
    target.data = getSecret();
    anotherTarget.copyData(target);
    target.overwrite("");
    dangerousTransmission(anotherTarget.data);
  }

  private void copyData(Target target) {
    this.data = target.data;
  }

  private static void dangerousTransmission(String key) {
    System.out.println("Key handed out: " + key);
  }

  private void overwrite(String newData) {
    this.data = newData;
  }

  private static String getSecret() {
    return "I am secret.";
  }

}
