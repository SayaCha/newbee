import java.io.*;
public class BufferedWriter  {
    public static void main(String[] args) throws IOException{
        FileWriter fw=new FileWriter("E:/name2.txt",true);
        BufferedWriter bf=new BufferedWriter();
        fw.write("java");
        fw.close();
    }
}
