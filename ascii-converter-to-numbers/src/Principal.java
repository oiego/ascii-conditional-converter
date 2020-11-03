import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

		System.out.println("Char 'A' must print 1000, 'C' must print 3000, so on \nChar 'a' must print 1 'b' must print 2\n'exit' must quit app");
		for (; true;) {
			Scanner scan = new Scanner(System.in);
			System.out.print("enter instruction->");
			String a = scan.nextLine();
			if (a.equals("exit")) {
				break;
			}
			Character b = a.charAt(0);
			int num = b;
			System.out.println("ascii code -> " + num + "\n");
			if (num < 97 && num >= 65) {
				// upper
				System.err.println("RESULT IS -> " + (num - 64) * 1000 + "\n");
			}else if (num >= 97 && num <= 129) {
				// lower
				System.err.println("RESULT IS -> " + (num-96) + "\n");
			} else {
				// exception
				System.out.println("a-z || A-Z please");
			}
		}
		System.out.println("bye");
	}
}
