import java.util.Scanner;
public class Arrays
{
    public static void main(String[] args)
    {
       /* float[] marks = {45.6f, 667.8f, 89.90f};
        float sum = 0;
        for (float element:marks)
         {
            sum = sum + element;
        }
        System.out.println(sum/marks.length);
        */
        //sum of two 2d arrays
      /*  int [][] mat1={{1,2,3},{4,6,7}};
        int [][] mat2={{5,6,7},{8,9,0}};
        int sum=0;
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                sum = mat1[i][j]+mat2[i][j];
                System.out.print("\t"+sum);
            }
            System.out.println("\n");
        }*/
       /*int [] markss={34,56,100,89,23};
        int l= markss.length;
        System.out.println(l);
        int  max=markss[0];
        for(int i=0;i<l-1;i++)
        {
            if(max<markss[i+1])
                max=markss[i+1];
        }
        System.out.println(max);

        int[] marks = {34,56,-9,-8,23,78};
        int l1 = marks.length;
        System.out.println(l1);
        int min = marks[0];
        for (int i = 0; i < l - 1; i++)
        {
            if (min > marks[i + 1])
                min = marks[i + 1];
        }
        System.out.println(min);*/
      /*  Scanner sc=new Scanner(System.in);
        System.out.println("enter n!");
        int n;
        n=sc.nextInt();
        int [] arr=new int[n];
        int sum=0;
        System.out.println("enter elements of array!");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("sum is : ");
        System.out.println(sum);*/
         Scanner sc=new Scanner(System.in);
         System.out.println("enter values of m and c");//2x3  3 4 4
         int m=sc.nextInt();                          //     6 7 8
         int c=sc.nextInt();
         int [][] multi= new int[m][c];
         for(int i=0;i<m;i++)
         { for(int j=0;j<c;j++)
             {
                 multi[i][j]=sc.nextInt();
             }
         }
        for(int i=0;i<m;i++)
        {
            for (int j = 0; j<c; j++)
            {
                System.out.print(multi[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        //String news=sc.nextLine();
        //System.out.println(news);
    }

}
