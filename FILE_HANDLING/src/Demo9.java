/*Accept the names of two files & copy the content of the first to the second.first file 
 *having book name & author name in file.Second file having the content of first 
 *file & also add the comment 'end-of file' at the end. 
 */
import java.io.*;
class Demo9 
{
	public static void main(String[] args)throws Exception
	{
		
		FileReader f1=new FileReader("def.txt");
		FileWriter f2=new FileWriter("def1.txt");
		BufferedReader br=new BufferedReader(f1);
		String s1;
		while((s1=br.readLine())!=null)
		{
			f2.write(s1+"\n");
		}
		f2.write("End of the here...");
        f1.close();
        f2.close();
        System.out.println("Copy success...");
	
	}
	

}
/*---------------output---------
 * Copy success...
------------------file(def1.txt)-----------
Bookname=JAVA programming
authorname=mrs.shinde
End of the here...

--------------file(def.txt)------
Bookname=JAVA programming
authorname=mrs.shinde

*/