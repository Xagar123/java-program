import java.util.Scanner;
public class Area{
    public static void main(String[] args) {
        int r;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of r : ");
        r = sc.nextInt();
        double pi = 3.14;
        double area = pi * r * r;
        System.out.println("Area of circle is : "+area);
        
    }
}