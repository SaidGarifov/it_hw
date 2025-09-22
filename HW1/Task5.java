import java.util.Scanner;
public class Task5 {
	public static void main(String[] args) {
		Scanner numb = new Scanner(System.in);
		float x = numb.nextFloat();
		float y = numb.nextFloat();
		float n = numb.nextFloat();
		if ((x*x < n*n/4) && (y*y < n*n/4)) {
			System.out.println("Попал");
		} else {
			System.out.println("Целься лучше");
		}
	}
}