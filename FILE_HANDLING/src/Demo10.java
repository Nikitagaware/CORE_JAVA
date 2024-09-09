//File Class
import java.io.*;
class Demo10 
{
	public static void main(String[] args)throws Exception
	{
	   File f1=new File("d:\\ty");
	   if(f1.exists())
	   {
		   System.out.println("File/Folder found");
		   if(f1.isDirectory())
			   System.out.println("It is Directory");
		   if(f1.isFile())
			   System.out.println("It is File");
		   if(f1.canRead())
			   System.out.println("File is Readable");
		   if(f1.canWrite())
			   System.out.println("file is Writable");
		   System.out.println("File Path="+f1.getPath());
		   System.out.println("File Absolute Path="+f1.getAbsolutePath());
		   System.out.println("file name="+f1.getName());
		   System.out.println("File length/size="+f1.length());
		   System.out.println("File last modified time="+f1.lastModified());
	   }
	   else
	   {
		   System.out.println("File/Folder not found");
	   }
	}

}
/*-----------output-------------
File/Folder found
It is Directory
File is Readable
file is Writable
File Path=d:\ty
File Absolute Path=d:\ty
file name=ty
File length/size=0
File last modified time=1725903120008
*/