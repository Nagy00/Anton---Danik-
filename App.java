import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class App {

	public static void main(String[] args)  {

		int n = 0;
		int antonoWons = 0;
		int danikWons = 0;
		String input = "";
		Scanner scanner = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = scanner.nextInt();
		try {
			input = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == 'A') {
				antonoWons++;
			} else if (ch == 'D') {
				danikWons++;
			}
		}		
		scanner.close();
		if (antonoWons > danikWons) {
			System.out.println("Anton");
		} else if (danikWons > antonoWons) {
			System.out.println("Danik");
		} else {
			System.out.println("Friendship");
		}
	}
}
