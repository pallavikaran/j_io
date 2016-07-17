import java.io.*;

class FileReaderDemo 
{
	public static void main(String[] args) throws IOException,FileNotFoundException
	{
		File f= new File("abc.txt");
		FileReader fr= new FileReader(f);
		File f2= new File("pqr.txt");
		FileWriter fw= new FileWriter(f2);
				int i;
				while(   ( i=fr.read())!=-1    )
			{
					fw.write(i);
					//System.out.print((char)i);
			}
		fr.close();
		fw.close();
		System.out.println("File Copied");
	}
}
