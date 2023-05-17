package typesloops;
import java.util.*;
public class Forloopodd {
// this class is explains about finding odd numbers between 1 to 25
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int N, i, sum = 0;
		 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        N = in.nextInt();
 
        for(i = 1; i <= 25; i++){
            if((i%2) == 1){
                sum += i;
            }
        }
     
        System.out.print("Sum of all odd numbers between 0 to "
            + N + " = " + sum);
}
	}










































