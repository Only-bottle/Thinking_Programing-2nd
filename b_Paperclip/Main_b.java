package b_Paperclip;

import java.util.Scanner;

public class Main_b {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int h = scan.nextInt();	// 세로
		int w = h;	// 가로
		
		int[][] paper = new int[h][w];
		
		for(int i = 0; i < h; i++) {
			for(int j = 0 ; j < w; j++) {
				paper[i][j] = scan.nextInt();
			}
		}
		
		while(true) {			
			for(int i = 0 ; i < h; i++) {
				for(int j = 0 ; j < w/2 ; j++) {
					paper[i][j] += paper[i][w-1-j];
					paper[i][w-1-j] = 0;
				}
			}			
			w = w/2;
			for(int i = 0 ; i < w; i++) {
				for(int j = 0 ; j< h / 2 ; j++) {
					paper[j][i] += paper[h-1-j][i];
					paper[h-1-j][i] = 0;
				}
			}			
			h = h/2;
			if(w == 1 && h == 1) {
				System.out.println(paper[0][0]);
				break;
			}
		}
	}
}
