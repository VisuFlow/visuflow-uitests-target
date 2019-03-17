package de.userstudy.target1;

public class Target extends SuperTarget{
	
	String data;

  public static void main(String[] args) {
    Target target = new Target();
    Target anotherTarget = new Target();
    target.data = Target.getData(target);
    anotherTarget.data = copyData(target.data);
    target.overwrite("");
    dangerousTransmission(target.data);
  }

  static String getData(SuperTarget target){
	  return SuperTarget.getData(target);
  }

}
