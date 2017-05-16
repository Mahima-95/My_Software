import java.io.File;

public class DeleteFileViaSHortMethod {
	public static void main(String[] args) {
		File file = new File("D:\\Mahima\\Mahima docs\\java prac\\1.txt");
		file.delete();
		System.out.println("Deleted..!!!");

	}
}
