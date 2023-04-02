import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/*
public class FileHandling {
    public static void main(String[] args) throws IOException
    {
        File f1=new File("E:/name1.txt");//aas a string file ka path name pass krte hai
        f1.createNewFile();
        System.out.println("Is exist:"+f1.exists());
        System.out.println(f1.length());
        System.out.println(f1.canWrite());
        //f1.delete() bhi hota h
    }
}
*/
public class FileHandling
{
    public static void main(String[] args) throws IOException
    {
        int i;
        FileOutputStream fout=new FileOutputStream("E:/name2.txt",true);
        String s="TATA";
        char ch[]=s.toCharArray();
        for(i=0;i<s.length();i++)
        {
             fout.write(ch[i]);
        }
        fout.close();
    }
}