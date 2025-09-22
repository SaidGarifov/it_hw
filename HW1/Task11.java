import java.util.Scanner;
public class Task11{
	public static void main(String[] arg){
		Scanner binNum = new Scanner(System.in);
		int bin = binNum.nextInt();
		int perevod = 0;
		int razriad = 1;
		while (bin > 0){
			perevod += (bin % 10)*razriad;
			bin /=10;
			razriad*=2;
		}System.out.println(perevod);
	}
}