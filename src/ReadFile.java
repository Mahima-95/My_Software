import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	private static final String fileName = "D:\\Mahima\\Mahima docs\\java prac\\1.txt";

	public static void main(String[] args) {
		BufferedReader bufferedReader = null;
		FileReader fileReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader(fileName));
			String a;
			while ((a = bufferedReader.readLine()) != null) {
				System.out.println(a);
			}
		} catch (IOException exception) {
			exception.printStackTrace();
		} finally {
			try {
				if (bufferedReader != null) {
					bufferedReader.close();
				}
				if (fileReader != null) {
					fileReader.close();
				}
			} catch (IOException exceptioIoException) {
				exceptioIoException.printStackTrace();
			}

		}
	}
}
