//sum of first n natural number
import java.util.Scanner;
public class Natural{
    public static void main(String[] args){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            sum = sum +i;
        }
        system.out.println("Sum of natural number is: "+ sum);
    }
}