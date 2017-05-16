import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndDeleteFile {
	private static final String fileName = "D:\\Mahima\\Mahima docs\\java prac\\1.txt";

	public static void main(String[] args) {
		BufferedReader bufferedReader = null;
		FileReader fileReader = null;
		BufferedWriter bufferedWriter = null;
		try {
			// fileReader = new FileReader(fileName);
			// bufferedReader = new BufferedReader(fileReader);
			String sCurrentLine;
			bufferedWriter = new BufferedWriter(new FileWriter(fileName));
			bufferedWriter.write("Hello");
			bufferedWriter.close();
			boolean success = (new File(fileName)).delete();
			if (success) {
				System.out.println("file has been successfully deleted...!!!");
			}
			bufferedReader = new BufferedReader(new FileReader(fileName));
			while ((sCurrentLine = bufferedReader.readLine()) != null) {
				System.out.println(sCurrentLine);
			}

		} catch (IOException ioException) {
			ioException.printStackTrace();
		} finally {
			try {
				if (bufferedReader != null) {
					bufferedReader.close();
				}
				if (fileReader != null) {
					fileReader.close();
				}
			} catch (IOException exception) {
				exception.printStackTrace();
			}
		}
	}
}
