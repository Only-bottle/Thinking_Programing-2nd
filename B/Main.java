package B;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int h = scan.nextInt();	// ¼¼·Î
		long sum = 0;
		
		for(int i = 0; i < h*h; i++) 
				sum += scan.nextInt();
		System.out.println(sum);
	}
}