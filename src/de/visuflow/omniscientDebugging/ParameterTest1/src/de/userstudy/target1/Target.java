package de.userstudy.target1;

public class Target {

  String data;

  public static void main(String[] args) {
    Target target = new Target();
    Target anotherTarget = new Target();
    target.data = getSecret();
    copyData(target.data, anotherTarget);
    target.overwrite("");
    dangerousTransmission(anotherTarget.data);
  }

  private static void copyData(String a, Target target) {
    target.data = a;
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
