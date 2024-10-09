package FileIo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {

	public static void main(String[] args) throws IOException {
	
		
		//File file= new File("D:\\\\Rahul patil\\myFile.txt");
		FileReader fr=new FileReader("D:\\\\Rahul patil\\myFile.txt");
		
		BufferedReader br= new BufferedReader( fr,50);
		//Read 50 characters in a line   
		String str;
		while((str =br.readLine())!= null)
		{
			System.out.println(str);
			
		}

	}

}
