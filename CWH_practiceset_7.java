// import java.util.Scanner;
public class CWH_practiceset_7 {
    static void multiplication(int n){
        for(int i = 1;i<=10;i++){
            System.out.format("%d X %d = %d\n",n,i,n*i);
        }
    }
    //for question 2:
    static void pattern1(int n){
        for(int i = 0;i < n;i++){
            for(int j = 0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //for Question 8:
    static void pattern1_rec(int n){
        
        if(n>0){
            pattern1_rec(n-1);
            for(int i=0;i<n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    //pattern1_rec(3)
    //pattern1_rec(2) + 3 times star and new line
    //pattern1_rec(1) +1 times star and new line +2 times star and new line + 3 times star and new line
    }
    //for question 3:sum(n)=1+2+3+...+n
    //sum(n)=1+2+3+...+n-1+n
    //sum(n)=sum(n-1) + n
    //sum(3)=3+sum(2)
    //sum(3)=3+2+sum(1)
    //sum(3)=3+2+1
    static int sumRec(int n){
        //Base condition
        if(n==1){
            return 1;
        }
        return n + sumRec(n-1);
    }
    //for question 5:
    static int fib(int n){
        // if(n == 1){
        //     return 0;
        // }
        // else if(n==2){
        //     return 1;
        // }
//      OR:
        if(n==1 || n==2){
            return n-1;
        }
        
        else{
            return fib(n-1) + fib(n-2);
        }
    }

    public static void main(String[] args) {
//Question 1:Write a java method to print multiplication table of a number n:
    //     multiplication(7);

//Question 2:Write a java program ung functions to print the following pattern:
        // pattern1(4);

//Question 3:Write a recursive function to calulate sum of first n natural numbers:
            // int c = sumRec(4);
            // System.out.println(c);

//Question 5:Write a program to write the nth term of fbonacci series:
            //fibonacci series - 0,1,1,2,3,5,8,13,21,34
            // int result = fib(9);
            // System.out.println(result);

//Question 8:Repeat 2 using recursion:
            pattern1_rec(7);

//Question 9:
        // Scanner sc = new scanner(System.in);
        // System.out.println("ENter temperature in degree celcius:");
        // double C = sc.nextDouble();
        // double F = (C*9/5)+32;
        // System.out.println(C+"");
    }
}