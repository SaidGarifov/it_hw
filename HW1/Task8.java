import java.util.Scanner;
public class Task8{
	public static void main(String[] arg) {
		Scanner numb = new Scanner(System.in);
		int k = numb.nextInt();
		for (int i = 0; i<11; i++){
			System.out.println(i*k);
		}
	}
}