import java.io.IOException;

public class Sample {

	public static void main(String[] args) throws IOException {
		char user_char; //user
		int continue_var = 0;

		System.out.println("Enter the character :");
		while (continue_var == 0) {
			user_char = (char) System.in.read();
			if ((user_char >= 'A' && user_char <= 'Z') || (user_char >= 'a' && user_char <= 'z')) {
				if (user_char == 'Q') {
					continue_var = 1;

					System.out.println("Quit the program");
					break;
				}

			} else {

				System.out.println("Enter the character :");
				

			}
		}

	}

}
