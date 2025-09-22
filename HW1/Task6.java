import java.util.Scanner;
public class Task6 {
	public static void main(String[] args) {
		Scanner numb = new Scanner(System.in);
		float x = numb.nextFloat();
		float y = numb.nextFloat();
		float n = numb.nextFloat();
		if (x*x + y*y < n*n) {
			System.out.println("Попал");
		} else {
			System.out.println("Целься лучше");
		}
	}
}