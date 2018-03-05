import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PostalRateCalc {
	
	public static String fromPostalCode;
	public static String toPostalCode;
	public static double length;
	public static double width;
	public static double height;
	public static double weight;
	public static char postType;
	
	String[] availablePostalCodes = { "h2x2e4", "k8n1l9", "m5e1w5", "t9h0b8", "k1a1m2", "b3h0b4" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("----- Postal Rate Calculator for ECSE428 -----");
		
		if(args == null) {
			System.out.println("Error: No arguments provided.");
		}
		
		else if(args.length != 7) {
			System.out.println("Not valid usgae!");
		}
		
	}

}
