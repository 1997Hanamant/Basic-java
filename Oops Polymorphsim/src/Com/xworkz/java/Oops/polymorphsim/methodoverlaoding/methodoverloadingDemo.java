package Com.xworkz.java.Oops.polymorphsim.methodoverlaoding;

public class methodoverloadingDemo {
	public static void main(String args[]) {
		Raghu raghu=new Raghu();
		Friend friend=new Friend();
		unknow unknow=new unknow();
		raghu.speak(friend);
		raghu.speak(unknow);
		
	}

}
