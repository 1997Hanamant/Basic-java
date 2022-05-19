class switchSatement
{
public static void main(String args[])
{
//int num=3;
//switch(num){
//case 1: System.out.println("Sunday");
    //  break;
//case 2:	 System.out.println("monday"); 
    //  break;
//case 3:System.out.println("Tuseday");	  
    // break;
//case 4:System.out.println("wendsday");
    // break;
//case 5:System.out.println("Thursday");
    // break;
//case 6:System.out.println("Friday");
    // break;
//case 7:System.out.println("saturday");
   //  break;
//default:System.out.println("Invaild input");
//}

//int number=20;
//switch(number){
	//case 10:System.out.println("10");
	//break;
	//case 20:System.out.println("20");
	//break;
	//case 30:System.out.println("30");
	//break;
	//default:System.out.println("Not in 10,20 or30");
//}
//char ch='O';
//switch(ch){
	//case'a':
	//System.out.println("Vowel");
	//break;
	//case'e':
	//System.out.println("Vowel");
	//break;
	//case'i':
	//System.out.println("Vowel");
	//break;
	//case'u':
	//System.out.println("Vowel");
	//break;
	//case'o':
	//System.out.println("Vowel");
	//break;
	//default:
	//System.out.println("Consonant");
//}

String branch="CE";
int year=4;

switch(year){
	case 1:
	        System.out.println("1st year subject is basic civil");
	break;
	case 2: 
	        System.out.println("2nd semeter subject is som ");
	break;
	case 3:
	       System.out.println("3rd year subject is Environmental Engineering");
	break;
	case 4:
	      System.out.println("4th year subject is bridge Engineering");
	switch(branch){
		case "ME":
              System.out.println("Mechanical branch");
		break;
		case "CE":
		       System.out.println("Civi branch");
		break;
		case "CSE":
		       System.out.println("Computer sceince branch");
		break;
		case "EE":
		      System.out.println("Eletrical branch");
		break;
		default:
		     System.out.println("not related to any branch");
	}
}
		
	
}
}