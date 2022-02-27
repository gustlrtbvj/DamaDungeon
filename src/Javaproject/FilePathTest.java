package Javaproject;

import java.io.File;
import java.net.URL;

public class FilePathTest {

	public static void main(String[] args) {

		File file = new File("music");
		
		System.out.println(file.getAbsolutePath());
		
	}

}
