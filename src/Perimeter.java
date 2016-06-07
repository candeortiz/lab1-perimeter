import java.util.Scanner;

public class Perimeter {

	public static void main(String[] args) {

		while (true) {

			Scanner scan = new Scanner(System.in);
			System.out.print("Enter Length: ");
			double n1 = scan.nextDouble();
			System.out.print("Enter Width: ");
			double n2 = scan.nextDouble();
			double perimeter = (n1 * 2) + (n2 * 2);
			double area = n1 * n2;
			System.out.println("Perimeter: " + perimeter);
			System.out.println("area: " + area);
			System.out.println("Do you want to continue? ");
			Scanner Keyboard = new Scanner(System.in);
			String answer = Keyboard.nextLine();

			if (answer.equals("no")) {
				break;

			}
		}

	}
}
// clear the input stream wenn ich nur einen Scanner habe und nicht die ganze
// Zeit einen neuen
// generieren
// String garbage = scan.nextLine();
// String input = scan.nextLine();