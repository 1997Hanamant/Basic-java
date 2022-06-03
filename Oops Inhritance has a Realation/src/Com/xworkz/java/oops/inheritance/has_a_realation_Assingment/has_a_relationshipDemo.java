package Com.xworkz.java.oops.inheritance.has_a_realation_Assingment;

public class has_a_relationshipDemo {

	public static void main(String args[]) {
		
		human Human=new human();
		Human.heart=new Heart();
		Human.heart.location="Left side";
		Human.heart.havles="Two";
		Human.name="manju";
		Human.color="black";
		
		System.out.println("print details");
		System.out.println("heart location:"+Human.heart.location);
		System.out.println("heart havles:"+Human.heart.havles);
		System.out.println("Human name:"+Human.name);
		System.out.println("Human color:"+Human.color);
		System.out.println("Function");
		Human.heart.heartbeat();
	}
}
	
