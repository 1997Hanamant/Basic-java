package Com.xworkz.java.Oops.Inheritance.MultilevelInheritance;

public class MultilevelinheritannceDemo {

	public static void main(String args[]) {
		
		Bird B=new Bird();
		Peacock P=new Peacock();
		BabyPeacock Bb=new BabyPeacock();
		
		Bb.dance();
		Bb.fly();
		Bb.play();
		Bb.follow();
		P.fly();
		P.dance();

		
	}
}

