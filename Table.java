import java.util.Scanner;
public class Table{
    public static void main(String[] args) {
        int n, a, b, c, d, e;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        n = sc.nextInt();
        a = n * 1;
        b = n * 2;
        c = n * 3;
        d = n * 4;
        e = n * 5;
        System.out.println("Table of given number is ");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
    