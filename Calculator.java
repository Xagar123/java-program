import java.util.*;
public class Calculator{
    public static void main(String[] args){
    int a, b, n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the First number : ");
    a = sc.nextInt();
    System.out.print("Enter the Second number : ");
    b = sc.nextInt();
    System.out.print("Select 1 for Addition\n Select 2 for Substration\n Select 3 for multiplication\n Select 4 for division\n Select 5 for modulus : ");
    n = sc.nextInt();
    int sum = a + b;
    int sub = a - b;
    int mul = a * b;
    float div = a / b;
    int mod = a % b;
    switch(n){
        case 1: System.out.println(sum);
        break;
        case 2: System.out.println(sub);
        break;
        case 3: System.out.println(mul);
        break;
        case 4: System.out.println(div);
        break;
        case 5: System.out.println(mod);
        break;

    }
}
}