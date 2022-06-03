package Com.xworkz.java.oops.inheritance.has_a_realation;

public class has_a_RealationDemo {
	public static void main(String args[]) {
		
		Libaray libaray=new Libaray();
		libaray.student=new Student();
		libaray.student.name="Guru";
		libaray.student.id="2av15cv011";
		libaray.student.branch="civil";
		libaray.name="Vidyalaya";
		libaray.location="Hubli";
		
		System.out.println("student name:"+libaray.student.name);
		System.out.println("student id:"+libaray.student.id);
		System.out.println("student barnch:"+libaray.student.branch);
		System.out.println("libaray name:"+libaray.name);
		System.out.println("libaray location:"+libaray.location);
		
		Libaray libaray1=new Libaray();
		libaray1.student=new Student();
		libaray1.student.name="ravi";
		libaray1.student.id="2av15cs012";
		libaray1.student.branch="cs";
		libaray1.name="Central libaray";
		libaray1.location="Badami";
		
		System.out.println("student name:"+libaray1.student.name);
		System.out.println("student id:"+libaray1.student.id);
		System.out.println("student barnch:"+libaray1.student.branch);
		System.out.println("libaray name:"+libaray1.name);
		System.out.println("libaray location:"+libaray1.location);
	}
	

}
