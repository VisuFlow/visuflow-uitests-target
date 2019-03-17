package de.userstudy.target1;

public class Target {

  String data;

  public static void main(String[] args) {
    Target target = new Target();
    Target anotherTarget = new Target();
    anotherTarget.data = Target.getSecret();
    int i = 0;
    if(target.data.equals("abc")){
    	i = 7;
    }
    for(;i < 10; i++){
    	target.data = copyData(anotherTarget.data);
    }
    anotherTarget.overwrite("");
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
