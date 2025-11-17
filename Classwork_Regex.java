import java.util.Scanner;
public class Regul1 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        String text = ("Компания "+ "Рога и копыта" + "основана 15.03.2005.")+(" Контакты: director@roga.ru, support@roga-kopita.com.")+(" Бюджет проекта: 1500000 рублей. Штаб-квартира в Москве.");
		String newText = "";
		int count = 0;
		for (int i = 0; i<text.length();i++){
			if(text.charAt(i) != ',' && text.charAt(i) != '"' && text.charAt(i) != ']' && text.charAt(i) != '!' && text.charAt(i) != ':' && text.charAt(i) != ';'){
                newText += text.charAt(i);
            }	
		}
		System.out.println(newText);
		boolean flag = true;
		while (flag){
			System.out.print("Введите команду: ");
			String command = enter.nextLine();
			switch (command){
            case "1" -> System.out.println(findEmails(newText));
            case "2" -> System.out.println(findDates(newText));
            case "3" -> System.out.println(findCapitalizedWords(newText));
            case "4" -> System.out.println(countDigits(newText));
			case "0" -> flag = false;
			}
		}
	}
	
	public static int countDigits(String text){
        int count = 0;
        for (int i = 0; i < text.length(); i++){
            String ch = text.charAt(i) + "";
            if(ch.matches("[0-9]")){
				count++;
			} 
        }
        return count;
    } 
	
	public static String findCapitalizedWords(String text){
        String[] x = Split(text);
        String res = "\n";
        int z = 1;
        for(int i = 0; i < x.length; i++){
            if(x[i].matches("[A-Z||А-Я][a-z||а-я]+.*")){
                res += z + ". " + x[i] + "\n" ;
                z++;
            }
        }
        return res;
    }
	
	public static String findDates(String text){
        String[] x = Split(text);
        String res = "\n";
        int k = 1;
        for(int i = 0; i < x.length; i++){
            boolean d31 = x[i].matches("(0[1-9]|[1-2][0-9]|3[0-1])\\.(0[135789]|10|12)\\.\\d{4}\\.?");
            boolean d30 = x[i].matches("(0[1-9]|[1-2][0-9]|30)\\.(0[469]|11)\\.(\\d{4})\\.?");
			boolean fevral = x[i].matches("(0[1-9]|1[0-9]|2[0-8])\\.02\\.(\\d{4})\\.?");
            if(d31 || d30 || fevral){
                res += k + ". " + x[i] + "\n";
				k++;
            }
        }
        return res;
    }
	
	public static String findEmails(String text){
		String[] x = Split(text);
		String res = "\n";
		int n = 1;
		for(int i = 0; i < x.length; i++){
			if(x[i].matches("\\w+@([a-z0-9-_.]+)\\.(com|ru).*")){
				res += n + ". " + x[i] + "\n";
				n++;
			}
		}
		return res;
	}
	public static String[] Split(String text){
		int count = 0;
		for (int i = 0; i<text.length();i++){
			if (text.charAt(i)==' '){
				count++;
			}	
		}
		String[] arraySplit = new String[count+1];
		int i = 0;
		int p = 0;
		String lineSplit = "";
		
		while (i < text.length()){
			lineSplit += text.charAt(i);
			if (text.charAt(i)==' ' || i == (text.length()-1)){
				arraySplit[p] = lineSplit;
				lineSplit = "";
				p++;
			}
			i++;
		}
		return arraySplit;
	}
}
