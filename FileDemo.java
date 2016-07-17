//import java.io.File;
import java.io.*;
import java.util.Date;
class FileDemo 
{
	public static void main(String[] args) 
	{
		try{
		File f1= new File("C:/3i_java/j_io/abc.txt");
		System.out.println("Parent of f1="+f1.getParent());
		File fp= f1.getParentFile();
				System.out.println("Path of Parent: "+ fp.getAbsolutePath());
			System.out.println("Size="+f1.length()+" bytes");
			File f2= new File("c:/ishaque");
			System.out.println("Name ="+f1.getName());
			System.out.println("is f1 file :"+ f1.isFile());
			System.out.println("is f1 directory :"+ f1.isDirectory());
		System.out.println("Path: "+ f1.getPath());
		System.out.println("Path: "+ f1.getAbsolutePath());
		//System.out.println("is file exists? : "+f1.exists());
		f1.createNewFile();
		//System.out.println("is file exists? : "+f1.exists());

		File f3= new File("C:\\ankit");
		f3.delete();
	//	f3.mkdir();
		File f4=new File("C:/3i_java/WrapperDemo.java");
			System.out.println("Last Modif: "+new Date(f4.lastModified()));
			f4.setLastModified(new Date(104, 0,26).getTime());
	//	f3.renameTo(f4);

	File fd= new File("C:\\3i_java");
				File arr_f []= fd.listFiles();
				for(File f : arr_f)
			{
					System.out.println(f.getName()+"  "+f.length());
			}
				String arr[]= fd.list();
				for (String s: arr )
				{
						//	System.out.println(s);
				}
		}catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
/* exists()		getName()	getPath()		getAbsolutePath()  getParent()		getParentFile()		length()

  isFile()		isDirectory()  isReadable()	isWritable()  delete()	createNewFile()

  list()	listFiles()		renameTo(File)	  canRead()		canWrite()		isHidden()
  lastModified() setLastModified()  mkdir()  getTotalSpace()	getFreeSpace()



*/