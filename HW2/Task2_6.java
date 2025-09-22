import java.util.Scanner;
public class Task2_6{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float x = sc.nextInt();
		int res = 0;
		float stepen = 1;
		int fac = 1;
		for (int k = 1; k<=n;k++){
			fac *= k;
			res += (x*stepen)*fac;
			stepen *= x;
		}System.out.println(res);
	}
}