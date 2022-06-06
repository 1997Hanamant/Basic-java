package Com.xworkz.java.Oops.polymorphsim.methodoverridingassingment2;

public class MehodoverrindingDemo {
	public static void main(String args[]) {
		Arithmetic arth=new Arithmetic();
		Addition add=new Addition();
		Multiplication mul=new Multiplication();
		Substarction sub=new Substarction();
		add.Arithmeticoperation(10, 10);
		mul.Arithmeticoperation(20, 30);
		sub.Arithmeticoperation(50, 30);
		arth.Arithmeticoperation();
	}

}


 