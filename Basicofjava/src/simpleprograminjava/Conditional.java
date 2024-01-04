package simpleprograminjava;

public class Conditional {
	public static void main (String[]args) {
	   int age = 20;
	   if (age>21) {
		   System.out.println("allow to donate blood");
	   }
	   else if(age==21){ System.out.println("also allow to donate blood");
	   }
	   else { System.out.println("not allow to donate blood");}
	   
	   
	   int day =1;
	   switch(day) {
	   case 1:
		   System.out.println("mon");
		break;  
	   case 2:
		   System.out.println("tue");
		break; 
	   case 3:
		   System.out.println("wed");
		break; 
	   case 4:
		   System.out.println("thur");
		break; 
	   case 5:
		   System.out.println("fri");
		break; 
	   }
	}
	}
