import java.util.*;
public class Condition{
    public static void main(String[] args){
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter age : ");
    n = sc.nextInt();
    if(n>=18){
        System.out.println("Person is adult");
    }
    else{
        System.out.println("Person is not adult");
    }

}
}