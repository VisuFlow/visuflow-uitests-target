package de.userstudy.target1;

public class Target {

  String data;

  public static void main(String[] args) {
    Target target = new Target();
    Target anotherTarget = new Target();
    target.data = getSecret();
    if(target.data.equals("abc")){
    	anotherTarget.data = copyData(target.data);
    } else {
    	target.overwrite("");
    }    
    dangerousTransmission(target.data);
  }

  private static String copyData(String a) {
    String c = a;
    return c;
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