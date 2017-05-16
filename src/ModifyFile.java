import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ModifyFile {
	private static final String FILENAME = "D:\\Mahima\\Mahima docs\\java prac\\1.txt";

	public static void main(String[] args) {
		BufferedWriter bw = null;
		FileWriter fw = null;
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter your content here...!!!");
			String content = scanner.next();
			fw = new FileWriter(FILENAME);
			bw = new BufferedWriter(fw);
			bw.write(content);
			System.out.println("Done");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
				if (fw != null)
					fw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}