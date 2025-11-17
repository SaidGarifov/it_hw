import java.util.Scanner;
import java.util.regex.*;

public class RegTask1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Pattern pattern = Pattern.compile("\"[a-zA-Z1-9 ]*\"");
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()){
            System.out.println("Найдена цитата: " + matcher.group());
        }
    }
}

public class RegTask2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\[ERROR\\] \\d{4}-\\d{2}-\\d{2}: \\w+");
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()){
            System.out.println("Найдена ошибка: " + matcher.group());
        }
    }
}

public class RegTask3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Pattern pattern = Pattern.compile("<h3>\\w+<h3>");
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()){
            System.out.println("Найден товар: " + matcher.group());
        }
    }
}

public class RegTask4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
	Pattern pattern = Pattern.compile("[а-яА-я0-9,]+;?");
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()){
            System.out.println("Хз че просят: " + matcher.group());
        }
    }
}

public class RegTask5{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
	Pattern pattern = Pattern.compile("#[а-яА-я0-9_]+");
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()){
            System.out.println("Найден хештег: " + matcher.group());
        }
    }
}
