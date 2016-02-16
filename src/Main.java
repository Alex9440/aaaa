import java.io.IOException;
import java.util.List;
import java.util.Scanner;


public class Main {
	public static String a;
	public static char symb='*';//
	public static int number;//
	
	public static void main(String args[]) throws IOException {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		number = scan.nextInt();
		a = scan.toString();
		
		//String inputText = Processor.readText();
		Text text=new Text(a);
		List<Sent> s = text.getSent();
	
		for (int i = 0; i < s.size(); i++) {
			Sent sent = s.get(i);
			List<Word> w = sent.getWord();
			for (int j = 0; j < w.size(); j++) {
				Word word = w.get(j);
				word.replace(number, symb);
			}
		}
		
		//Scanner scan = new Scanner(System.in);
		//a = scan.nextLine();
		//number = scan.nextInt();
        //System.out.println(a);
        //System.out.println(number);        

	}
}
