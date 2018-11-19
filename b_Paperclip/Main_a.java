package b_Paperclip;

import java.util.Scanner;

public class Main_a {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int result = 0;
		for(int i = 0 ; i < n * n ; i ++) {
			int a = scan.nextInt();
			result += a;
		}
		System.out.println(result);		
		
	}

}
