package de.userstudy.target1;

public class Target {

  String data;

  public static void main(String[] args) {
    Target target = new Target();
    Target anotherTarget = new Target();
    target.data = Target.getTainted();
    anotherTarget.data = copyData(target.data);
    dangerousTransmission(target.data);
  }

  private static String getTainted(){
	  String returnValue = Target.getSecret();
	  return returnValue;
  }
  
  private static String copyData(String a) {
    String c = a;
    return c;
  }

  private static void dangerousTransmission(String key) {
    System.out.println("Key handed out: " + key);
  }

  private static String getSecret() {
    return "I am secret.";
  }

}