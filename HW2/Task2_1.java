import java.util.Scanner;
public class Task2_1{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		for (int i = 1; i<=m; i++){
			System.out.print("1");
		}System.out.println();
		for (int i = 1; i<=n-2; i++){
			System.out.print("1");
			for (int j = 1; j<=m-2; j++){
				System.out.print(" ");
			}
			if (m>1) System.out.print("1");
			System.out.println();
		}
		if (n>1){
			for (int i = 1; i<=m; i++){
			System.out.print("1");	
			}
		}
	}
}