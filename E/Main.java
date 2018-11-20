package E;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int R = input.nextInt();
		int C = input.nextInt();
		int Q = input.nextInt();
		int arr[][] = new int[R+1][C+1];

		/* 
		0	0	0	0	0	0	0	
		0	4	5	8	12	21	26	
		0	5	8	19	30	44	54	
		0	13	17	30	46	63	75	
		0	14	23	39	59	78	95	
		0	19	30	47	69	91	113 
		*/
		for (int i=1; i<=R; i++) {
			for (int j=1; j<=C; j++)
				arr[i][j] = input.nextInt() + arr[i-1][j] + arr[i][j-1] - arr[i-1][j-1];
		}
		
		/* 출력 할 평균 갯수 만큼 반복 */
		do {
			long sum = 0;
			// 시작 꼭지점
			int r1 = input.nextInt();
			int c1 = input.nextInt();
			// 끝 꼭지점
			int r2 = input.nextInt();
			int c2 = input.nextInt();
			sum = arr[r2][c2] - arr[r1 - 1][c2] - arr[r2][c1 - 1] + arr[r1 - 1][c1 - 1];
			System.out.println(sum / ((r2-r1+1)*(c2-c1+1)));
		} while(Q-- > 1);
	}
}
