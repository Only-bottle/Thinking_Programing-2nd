package b_Paperclip;

import java.util.Scanner;

public class Main {
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
			for(int i = 0 ; i < w / 2 ; i++) {
				for(int j = 0 ; j < h ; j++) {
					paper[j][i] += paper[j][w-1-i];
				}
			}			
			w = w/2;
			
			for(int i = 0 ; i < h / 2; i++) {//세로
				for(int j = 0 ; j< w ; j++) {//가로
					paper[i][j] += paper[h-1-i][j];
					paper[h-1-i][j] = 0;
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
