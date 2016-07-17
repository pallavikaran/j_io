import java.io.*;

class FileStreamDemo 
{
	public static void main(String[] args) throws IOException,FileNotFoundException
	{
		FileInputStream fis= new FileInputStream("C:/3i_java/j_io/abc.txt");
		File f= new File("xyz.txt");
			FileOutputStream fos= new FileOutputStream(f);
			int i;
			while(  (i=fis.read())!=-1)
			{
				fos.write(i);
				System.out.print((char)i);
		}
		fis.close();
		System.out.println("\nFile Copied...");
	}
}
