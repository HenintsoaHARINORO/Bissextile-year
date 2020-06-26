package bissextile;

import java.util.Scanner;

public class check {
    public static void main(String [] args) {
    	System.out.print("Please enter the year you want to test:");
    	Scanner sc= new Scanner(System.in);
    	int year=sc.nextInt();
    	System.out.println("This is the year you've entered:"+year);
    	if((year%400==0 && year%100!=0) || (year%400)==0) {
    		System.out.println(year+" is a bissextile year");
    	}
    	else
    		System.out.println(year+" is  not a bissextile year");
    }
}
