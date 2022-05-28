import java.util.*;
public class CheckingNumber{
    public static void main(String[] args){
    int a, b;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the First number which you want to check : ");
    a = sc.nextInt();
    System.out.print("Enter the Second number which you want to check : ");
    b = sc.nextInt();
    if(a == b){
        System.out.println("both are equal");
    }
    else if(a > b){
        System.out.println("a is greater");
    }
    else{
        System.out.println("a is lesser");
    }

}
}