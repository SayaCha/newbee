import java.io.*;
public class FileInputS {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fls=new FileInputStream("E:/name2.txt");
        do{
i=fls.read();
if(i!=-1){
    System.out.print((char)i);
}
        }
        while(i!=-1);
        fls.close();
    }
}
