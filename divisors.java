import java.util.Scanner;

public class divisors {
    public static void main(String [] args){

        Scanner scaner = new Scanner(System.in);

        System.out.println("insert a number");

        int j=scaner.nextInt();

        System.out.println("divisors of number");
        for( int i=1 ; i<=j ; i++){
            if( j % i != 0 ) continue;
            System.out.println(i);
        }
    }
}
