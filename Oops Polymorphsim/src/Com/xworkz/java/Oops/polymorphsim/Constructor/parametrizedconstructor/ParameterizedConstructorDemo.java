package Com.xworkz.java.Oops.polymorphsim.Constructor.parametrizedconstructor;

public class ParameterizedConstructorDemo {
	public static void main(String args[]) {
		Gun gun=new Gun("black",10,50.25);
		System.out.println("Gun Details");
		System.out.println("Gun color:"+gun.color);
		System.out.println("Gun noOfBullets:"+gun.noOfBullets);
		System.out.println("Gun weight:"+gun.weight);
		
		Gun gun1=new Gun("black",10,50.25);
		System.out.println("Gun Details");
		System.out.println("Gun color:"+gun.color);
		System.out.println("Gun noOfBullets:"+gun.noOfBullets);
		System.out.println("Gun weight:"+gun.weight);
	}

}
