import java.io*;
import java.lang*;/* package whatever; // don't place package name! */
import java.util.Scanner;
 class ideone
{
    public static void main(String[] args) 
    {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        number = scan.nextInt();
        scan.close();
        if(number > 0)
        {
            System.out.println(" positive number");
        }
        else if(number < 0)
        {
            System.out.println("negative number");
        }
        
    }
}
