package de.userstudy.target1;

public class SuperTarget {
	
	static String knowledge;
	
	static String getData(SuperTarget target){
		String result = getSecret();
		target.overwrite("");
		knowledge = result;
		return result;
	}
	
	static String copyData(String a) {
	    String c = a;
	    return c;
	}

	static void dangerousTransmission(String key) {
	    System.out.println("Key handed out: " + key);
	}

	void overwrite(String newData) {
	    SuperTarget.knowledge = newData;
	}

	private static String getSecret() {
	    return "I am secret.";
	}

	
}
