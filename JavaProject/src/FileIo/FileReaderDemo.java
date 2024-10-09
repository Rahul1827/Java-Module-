package FileIo;

import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		FileReader fr= new FileReader("D:\\Rahul patil\\myFile.txt");
		
		int i;
		while((i=fr.read()) != -1) 
		{
			System.out.print((char)i);
			
		}
	}

}
