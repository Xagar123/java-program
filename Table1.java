import java.util.Scanner;
class Table1 {
   public static void main(String args[]){
      int sum = 0;
      System.out.print("Enter the number for table:: ");
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      for(int i = 0; i<11; i++){
          sum = num * i;
          System.out.println("Table of given no. is : "+sum);
      }
      
    }
}