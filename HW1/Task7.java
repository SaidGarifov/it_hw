import java.util.Scanner;
public class Task7{
	public static void main(String[] args){
		Scanner numb = new Scanner(System.in);
		float x = numb.nextFloat();
		float y = numb.nextFloat();
		float shot = x*x + y*y;
		if (shot >=0 && shot<=1){
			System.out.println("1 круг");
		} else if (shot >1 && shot<=4){
			System.out.println("2 круг");
		}else if (shot >4 && shot<=9){
			System.out.println("3 круг");
		}else if (shot >9 && shot<=16){
			System.out.println("4 круг");
		}else if (shot >16 && shot<=25){
			System.out.println("5 круг");
		}else if (shot >25 && shot<=36){
			System.out.println("6 круг");
		}else if (shot >36 && shot<=49){
			System.out.println("7 круг");
		}else if (shot >49 && shot<=64){
			System.out.println("8 круг");
		}else if (shot >64 && shot<=81){
			System.out.println("9 круг");
		}else if (shot >81 && shot<=100){
			System.out.println("10 круг");
		}else {
			System.out.println("ЛОХ");
		}
		
	}
}