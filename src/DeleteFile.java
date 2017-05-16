import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DeleteFile {
	private static final String fileName = "D:\\Mahima\\Mahima docs\\java prac\\1.txt";

	public static void main(String[] args) {
		try {
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(
					fileName));
			bufferedWriter.write("Hello");
			bufferedWriter.close();
			boolean success = new File(fileName).delete();
			if (success) {
				System.out.println("file has been successfully deleted...!!!");
			}
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}
}
