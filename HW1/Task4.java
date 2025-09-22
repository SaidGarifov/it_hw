import java.util.Scanner;
public class Task4 {
	public static void main(String[] args){
		Scanner numb = new Scanner(System.in);
		float num1 = numb.nextFloat();
		float num2 = numb.nextFloat();
		if (num1 == num2) {
			System.out.println("Числа равны");
		}else {
			System.out.println("Числа не равны");
		}
	}
}