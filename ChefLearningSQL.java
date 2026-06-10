
import java.util.Scanner;
public class ChefLearningSQL {
    public static void main(String args[])
    {

    	Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int E = sc.nextInt();

        System.out.println((R + E) * C);
        sc.close();
    
    }
}
