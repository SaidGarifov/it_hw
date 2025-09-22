import java.util.Scanner;
public class Task2_5{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fac = 1;
		int sum = 0;
		for (int i = 1;i<=n;i++){
			fac *= i;
			sum += fac;
		}System.out.println(sum);
	}
}