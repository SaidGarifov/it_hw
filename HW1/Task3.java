import java.util.Scanner;
public class Task3{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble(); 
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double max = a;
		if (b>max){
			max = b;
		}if (c>max){
			max = c;
		}System.out.println("Сигмо число:"+max);
	}
}