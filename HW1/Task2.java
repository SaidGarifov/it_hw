import java.util.Scanner;
public class Task2 {
		public static void main(String[] args) {
			Scanner peremen = new Scanner(System.in);
			float per1 = peremen.nextFloat();
			float per2 = peremen.nextFloat();
			if (per1 > per2) {
				System.out.println("Большее число: " + per1);
			} else if (per1 < per2) {
				System.out.println("Большее число: " + per2);
			}else {
				System.out.println("Числа равны");
			}
		}
}