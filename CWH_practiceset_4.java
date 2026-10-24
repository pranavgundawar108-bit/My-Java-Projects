import java.util.Scanner; //for question2
public class CWH_practiceset_4 {
    public static void main(String[] args) {
//Question1:What will be the output of this program:
        // int a = 10;

        // if(a == 11) {
        //     System.out.println("I am 11");
        // }
        // else {
        //     System.out.println("I am not 11");
        // }

//Question2:Write a program to find out whether a student is pass or
//fail;if it requires total 40% and at least 33% in each subject to pass
//Assume 3 subjects and take total marks as an input from the user
        // byte m1,m2,m3;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your marks in physics:");
        // m1 = sc.nextByte();
        
        // System.out.println("Enter your marks in chemistry:");
        // m2 = sc.nextByte();

        // System.out.println("Enter your marks in maths:");
        // m3 = sc.nextByte();
        // float avg = (m1+m2+m3)/3.0f;
        // System.out.println("Your Overall percentage is:" + avg);
        // if(avg >= 40 && m1 >= 33 && m2 >= 33 && m3 >=33) {
        //     System.out.println("Congratulations,You have been promoted");

        // }
        // else {
        //     System.out.println("Sorry, You are not promoted! Please try again.");
        // }
    
//Question3:Calculate income tax paid by an employee to the government as per
//the slabs mentioned below:
/*
    income-slab    Tax
     2.5L-5.0L      5%
     5.0L-10.0L    20%
     Above 10.0L   30%
Note that there is no tax below 2.5L.Take input amount as an input from the user:
*/
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your Income in lakhs:");
        // float tax = 0;
        // float income = sc.nextFloat();
        // if(income < 2.5) {
        //     tax = tax + 0;
        // }
        // else if(income > 2.5f && income <= 5f) {
        //     tax = tax + 0.05f *(income - 2.5f);
            
        // }
        // else if(income > 5f && income <= 10f) {
        //     tax = tax + 0.05f *(5.0f - 2.5f);
        //     tax = tax + 0.05f *(income - 5f);
        // }
        // else if(income > 10.0f) {
        //     tax = tax + 0.05f *(5.0f - 2.5f);
        //     tax = tax + 0.05f *(10.0f - 5f);
        //     tax = tax + 0.05f *(income - 10.0f);
        // }    
        // System.out.println("The total tax paid by the employee is:" + tax);
        
//Question4:Write a java program to find out the day of the week given the number:
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the no:");
        // int day = sc.nextInt();
        // switch (day) {
            // case 7:
            //     System.out.println("Sunday");
            //     break;

            // case 1:
            //     System.out.println("Monday");
            //     break;

            // case 2:
            //     System.out.println("Tuesday");
            //     break;
            // case 3:
            //     System.out.println("Wednesday");
            //     break;
            // case 4:
            //     System.out.println("Thursday");
            //     break;
            // case 5:
            //     System.out.println("Friday");
            //     break;
            // case 6:
            //     System.out.println("Saturday");
            //     break;
            // default:
            //     break;
            //OR:
        //     case 1 -> System.out.println("Monday");
        //     case 2 -> System.out.println("Tuesday");
        //     case 3 -> System.out.println("Wednesday");
        //     case 4 -> System.out.println("Thursday");
        //     case 5 -> System.out.println("Friday");
        //     case 6 -> System.out.println("Saturday");
        //     case 7 -> System.out.println("Sunday");
        
        // }
//Question6:Write a program to find out the type of website from the url
//.com->commercial website
//.org->organizational website
//.in->indian website
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Write the prefix website end with:");
        // String website = sc.next();
        
        // if(website.endsWith(".com")) {
        //     System.out.println("This is a commercial website");
        // }
        // else if(website.endsWith(".in")) {
        //     System.out.println("This is a indian website");
        // }
        // else if(website.endsWith(".org")) {
        //     System.out.println("This is a organizational website");
    
        // }
    }
}
