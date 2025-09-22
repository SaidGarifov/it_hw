import java.util.Scanner;
public class Task2_4{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int stepen = 1;
		while (n>0){
			stepen *= 2;
			sum += stepen;
			n = n - 1;
		}System.out.println(sum);
	}
}