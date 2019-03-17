package de.userstudy.target1;

public class Target {

  String data;
  Secret secret;

  public static void main(String[] args) {
    Target target = new Target();
    Target anotherTarget = new Target();
    Secret secret2 = anotherTarget.new Secret();
    anotherTarget.secret = secret2;
    target.data = secret2.taint();
    dangerousTransmission(target.data);
  }

  private static void dangerousTransmission(String key) {
    System.out.println("Key handed out: " + key);
  }

  private void overwrite(String newData) {
    this.data = newData;
  }
  
  private class Secret{
	  private String secret = getSecret();
	  
	  private String getSecret() {
		  Target.this.overwrite("");
		  return "I am secret.";
	  }
	  
	  String taint(){
		  return secret;
	  }
  }

}
