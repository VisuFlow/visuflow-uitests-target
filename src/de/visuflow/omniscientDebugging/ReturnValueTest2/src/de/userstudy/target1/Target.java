package de.userstudy.target1;

public class Target {

  String data;

  public static void main(String[] args) {
    Target target = new Target();
    Target anotherTarget = new Target();
    anotherTarget.data = target.getTainted();
    dangerousTransmission(target.data);
    dangerousTransmission(anotherTarget.data);
  }

  private String getTainted(){
	  String returnValue = Target.getSecret();
	  
	  return returnValue;
  }

  private static void dangerousTransmission(String key) {
    System.out.println("Key handed out: " + key);
  }

  private static String getSecret() {
    return "I am secret.";
  }

}
