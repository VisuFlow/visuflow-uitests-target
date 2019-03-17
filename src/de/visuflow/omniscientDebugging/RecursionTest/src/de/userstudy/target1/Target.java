package de.userstudy.target1;

public class Target {

  String data;

  public static void main(String[] args) {
    Target target = new Target();
    Target anotherTarget = new Target();
    target.recursion(10);
    anotherTarget.data = copyData(target.data);
    dangerousTransmission(anotherTarget.data);
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
  
  private void recursion(int i){
	  String tmp = "";
	  if(i == 0){
		  tmp = getSecret();
	  } else {
		  tmp = "";
	  }
	  this.data = tmp;
  }

}
