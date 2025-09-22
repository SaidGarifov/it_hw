import java.util.Scanner;
public  class Task9{
	public static void main(String[] arg) {
		Scanner numb = new Scanner(System.in);
		int chislo = numb.nextInt();
		int k = 0;
		if (chislo < 0){
			chislo = chislo * (-1);
		}
		while (chislo > 0){
			k = k + chislo % 10;
			chislo = chislo / 10;
		}System.out.println(k);
	}
}