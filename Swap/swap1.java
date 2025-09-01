import java.util.*;
public class swap1{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter value for a: "); 
    int a=sc.nextInt();
    System.out.print("enter value for b: "); 
    int b=sc.nextInt();
    int temp;
    temp=a;
    a=b;
    b=temp;
    System.out.print("Values after swapping \na: " + a + "\nb: "+ b);
    sc.close();
}
}