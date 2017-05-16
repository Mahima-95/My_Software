import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EditFile {

	private static final String FILENAME = "D:\\Mahima\\Mahima docs\\java prac\\1.txt";

	public static void main(String[] args) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter your content here...!!!");
			String content = scanner.next();
			bw.write(content);
			System.out.println("Done");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
