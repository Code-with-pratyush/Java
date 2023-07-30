import java.util.*;
public class butterfly{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        //coding for rows
        for(int i=0;i<n;i++)
        {
            //for starting stars 
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            //for spaces
            for(int k=0;k<2*(n-i);k++)
            {
                System.out.print(" ");
            }
            //for right side stars
            for(int m=0;m<=i;m++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=0;i--){
            //for starting lower stars
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int k=0;k<2*(n-i);k++){
                System.out.print(" ");
            }
            for(int m=0;m<=i;m++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}