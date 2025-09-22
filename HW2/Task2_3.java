import java.util.Scanner;
public class Task2_3{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1 = n;
		int sum = 0;
		int stepen = 1;
		while (n1>0){
			stepen *= n;
			sum += stepen;
			n1 = n1 - 1;
		}System.out.println(sum);
	}
}