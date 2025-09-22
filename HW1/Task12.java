import java.util.Scanner;
public class Task12{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String st = "";
		while (num>0){
			st = String.valueOf(num % 2) + st;
			num /= 2;
		}System.out.println(st);
	}
}
