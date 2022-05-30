package Com.xwokz.java.Oops.Inheritance.Hireachical_Inheritance;

public class HireachicalInheritanceDemo {
	public static void main(String args[]) {
		 ComputerSceince cs=new ComputerSceince();
		 CivilEngineering cv=new CivilEngineering();
		 MechanicalEngineering me=new MechanicalEngineering();
		 
		cs.branchname="ComputerSceince";
		cs. university="Vtu";
		cv. branchname="Civil Engineering";
		cv.university="Vtu";
		me.branchname="Mechanical Engineering";
		me.university="Vtu";
		
		System.out.println("Details of Enginnering barnch");
		System.out.println("branch name:"+cs.branchname);
		System.out.println("university:"+cs.university);
		System.out.println("Function:");
		cs.DevelopSoftware();
		cs.research();
		
		System.out.println("Details of Enginnering barnch");
		System.out.println("branch name:"+cv.branchname);
		System.out.println("university:"+cv.university);
		System.out.println("Function:");
		cv.Construct();
		cs.research();
		

		System.out.println("Details of Enginnering barnch");
		System.out.println("branch name:"+me.branchname);
		System.out.println("university:"+me.university);
		System.out.println("Function:");
		me.assembleMachine();
		me.research();
		 
		
	}

}
