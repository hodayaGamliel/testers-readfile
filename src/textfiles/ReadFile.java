package textfiles;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;


public class ReadFile 
{

	private String path;
	public ReadFile (String file_path) 
	{
		path=file_path;
	}
	
	public String[] OpenFile() throws IOException
	{
		FileReader fr= new FileReader(path);
		BufferedReader textReader = new BufferedReader(fr);
		
		int numOfLines = readLines();
		String[] textData=new String[numOfLines];
		
		int i ;
		
		for (i=0 ; i < numOfLines; i++)
		{
			textData[i]=textReader.readLine();
		}
		
		textReader.close();
		return textData	;
	}
	
	int readLines() throws IOException
	{
		FileReader file_to_read = new FileReader(path);
		BufferedReader bf = new BufferedReader(file_to_read);
		
		String aLine;
		int numOfLines = 0;
		
		while ((aLine = bf.readLine()) != null)
		{
			numOfLines++;
		}
		bf.close();
		return numOfLines;
	}
}



/*
To read characters from a text file, the FileReader is used. 
This reads bytes from a text file, and each byte is a single character. 
You can read whole lines of text, rather than single characters. To do this,
you can hand your FileReader over to something called a BufferedReader.
The BufferedReader has a handy method called ReadLine. As its name suggests,  it is used to read whole lines, rather than single characters.
What the BufferedReader does, though, is to store characters in memory (the buffer) so that they can be manipulated more easily.
*/