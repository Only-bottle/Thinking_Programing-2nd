package E;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int R = input.nextInt();
		int C = input.nextInt();
		int Q = input.nextInt();
		int arr[][] = new int[R][C];

		for (int i=0; i<R; i++) {
			for (int j=0; j<C; j++)
				arr[i][j] = input.nextInt();
		}

		do {
			long sum = 0;
			int r1 = input.nextInt();
			int c1 = input.nextInt();
			int r2 = input.nextInt();
			int c2 = input.nextInt();

			for (int i=r1-1; i<r2; i++) {
				for (int j=c1-1; j<c2; j++)
					sum += arr[i][j];
			}
			System.out.println(sum / ((r2-r1+1)*(c2-c1+1)));

		} while(Q-- > 1);
	}
}
