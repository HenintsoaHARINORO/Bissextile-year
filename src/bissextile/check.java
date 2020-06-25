package bissextile;

import java.util.Scanner;

public class check {
    public static void main(String [] args) {
    	System.out.print("Please enter the year you want to test:");
    	Scanner sc= new Scanner(System.in);
    	int year=sc.nextInt();
    	System.out.print("The year you've entered is:"+year);
    }
}
