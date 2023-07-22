import java.util.*;

public class greater_num {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a =sc .nextInt();
        int b = sc.nextInt();

        if(a==b){
            System.out.println("The a and b are equal");

        }
        else{
            if(a>b){
                System.out.println("A is greater than b");
            }
            else{
                System.out.println("a is less than b");
            }
        }
    }
}
