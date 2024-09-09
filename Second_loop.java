import java.util.Scanner;

class Second_loop {
    public static void main(String args[]){

    int num;
    Scanner s=new Scanner(System.in);
    System.out.println("enter any number");
    num=s.nextInt();
     while(num>0)
     {
        if(num%2==0)
        {
            System.out.println("number is even");
        }
        else 
        {
            System.out.println("no is odd");
        }
     }
