package de.userstudy.target1;

public class Target {

  String knowledge;

  private void run() {
    Target secretAgent = new Target();
    String officeNote = getSecret();
    secretAgent.knowledge = officeNote;
    callDangerousTransmission(secretAgent);
  }

  public static void main(String[] args) {
    Target target = new Target();
    target.run();
  }

  private static void dangerousTransmission(String key) {
    System.out.println("Key handed out: " + key);
  }
  
  private static void callDangerousTransmission(Target target){
	  dangerousTransmission(target.knowledge);  
  }

  private static String getSecret() {
    return "I am secret.";
  }
}
