//write a java program to display ASCII values of the characters..
import java.io.*;
class Demo1 
{
	public static void main(String[] args) 
	{
	    try
	    {
	    	FileInputStream f1=new FileInputStream("abc.txt");
	    	int k;
	    	 while((k=f1.read())!=-1)       //-1 means EOF
	    	 {
	    		 System.out.println(k);
	    	 }
	    }catch(Exception e)
	    {
	    	System.out.println(e);
	    }

	}

}
/*----output----------------
72
105
105
46
46
46
13
10
71
111
111
100
32
77
111
114
110
105
110
103
32
46
46
46
13
10
72
97
118
101
32
97
32
110
105
99
101
32
68
97
121
33
33
33
13
10
*/