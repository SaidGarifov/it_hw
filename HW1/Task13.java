import java.util.Scanner;
public class Task13{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while(true){
			System.out.println("давай некст");
			int numNext = sc.nextInt();
			if (num > numNext){
				System.out.println("Ты по-моему перепутал");
				break;
			}
		}System.out.println("GG bro");
	}
}