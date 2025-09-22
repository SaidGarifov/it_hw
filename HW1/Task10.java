import java.util.Scanner;
public class Task10{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int razriad = 1;
		int num2 = num;
		while (num2 >= 10){
			razriad *= 10;
			num2 /= 10;
		}while (razriad > 0){
			int cif = num/razriad;
			if (cif != 0){
			System.out.print(cif * razriad + "+");	
			}
			num %= razriad;
			razriad /= 10;
		}
	}
}