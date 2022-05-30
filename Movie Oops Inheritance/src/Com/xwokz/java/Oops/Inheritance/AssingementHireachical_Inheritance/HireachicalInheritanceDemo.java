
	package Com.xwokz.java.Oops.Inheritance.AssingementHireachical_Inheritance;

public class HireachicalInheritanceDemo {
	public static void main(String args[]) {
		
	cabbage C=new cabbage();
	carrot Ca=new carrot();
	celery Ce=new celery();
	
	C.name="cabbage";
	C.color="green";
	Ca.name="carrot";
	Ca.color="red";
	Ce.name="celery";
	Ce.color="green";
	
	System.out.println("Details of  Vegetables:");
	System.out.println("name:"+C.name);
	System.out.println("color:"+C.color);
	System.out.println("Function");
	C.Eat();
	C.Vitamin();
	
	System.out.println("Details of  Vegetables:");
	System.out.println("name:"+Ca.name);
	System.out.println("color:"+Ca.color);
	System.out.println("Function");
	Ca.Eat();
	Ca.protein();
	
	System.out.println("Details of  Vegetables:");
	System.out.println("name:"+Ce.name);
	System.out.println("color:"+Ce.color);
	System.out.println("Function");
	Ce.Eat();
	Ce.fiber();
	
	
	}
	

}
