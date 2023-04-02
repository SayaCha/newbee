import java.io.*;
public class Throws {
    public static void main(String[] args) throws IOException
    {
        try{
        throw new IOException();
        //System.out.println("after exception");
            }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
    }

    }
}
