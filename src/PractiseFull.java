import java.util.Scanner;

import java.util.Random;
public class PractiseFull
{
    public static void main(String[] args) {
        System.out.print("1st function!");
        System.out.println("Adding two numbers and taking input from keyboard!!");
        Scanner sc = new Scanner(System.in);
        float a = 9;
        float b = 4;
        float div;
        div = a / b;
        System.out.println(div);
        float sum;
        sum = a + b;
        System.out.println(sum);
        System.out.println("2nd function!");
        System.out.println("playing with strings!!");
        String name = "learning_ java";
        System.out.println(name);
        System.out.println("sayali is " + name + " for " + sum + " times!");
        //boolean b1=sc.hasNextInt(); //we input any no./char then check
        //System.out.println(b1);
        // String str1=sc.nextLine(); // prints whole line
        // String str1=sc.next(); //prints one word of line
        // System.out.println(str1);
        String str2 = new String("  my name is sayali!  ");
        System.out.println(str2.trim());
        System.out.println(str2.substring(4));
        System.out.println(str2.substring(4, 8));
        System.out.println(str2.replace('s', 'p'));
        System.out.println(str2.startsWith(" "));
        String str4 = str2.toUpperCase();
        System.out.println(str4);
        System.out.println(str2.charAt(11));
        System.out.println(str2.lastIndexOf("sa", 5));
        System.out.println(str2.equalsIgnoreCase("sayali"));//ignores lower or upper cases
        int value = str2.length();
        System.out.println(value);
        System.out.println(str2);
        char grade = 'A';
        //grade=grade+3 (gives error)
        grade = (char) (grade + 3);
        System.out.println(grade);
        System.out.format("grade is %c", grade); // works like a c langauge
        System.out.println();
        System.out.println(str2.toUpperCase());
        System.out.println(str2.toLowerCase());
        System.out.println("i have \f a lovely \" family \" ");
        System.out.println("i have \r a lovely \" family \" ");
        System.out.println("i have \b a lovely \" family \" ");
        String letter = "dear name , thanks a lot.";
        letter = letter.replace("name", "sayali");
        System.out.println(letter);
        //char ch = sc.next().charAt(0);
       /* switch(ch) // advanced switch
        {
            case 'a'->{
                System.out.println("you are just a baby!");
            }
            case 'b'->{
                System.out.println("you are a teenager now!");
            }
            case 'c'->{
                System.out.println("you are a adult now!");
            }
            case 'd'->{
                System.out.println("you should rest now!..you are old!");
            }
            default -> {
                System.out.println("be you!");
            }
        }
        int sw=sc.nextInt();
        switch(sw) // normal switch
        {
            case 1 :{
                System.out.println("you should start study!");
            }break;
            case 2:{
                System.out.println("now start with easy topic");
            }break;
            case 3:{
                System.out.println("you have gained confidence!");
            }break;
            case 4:{
                System.out.println("now study hard subject");
            }break;
            default:{
                System.out.println("be consistent!");
            }break;
        }
        */
        Random random = new Random();
        int num = random.nextInt(91); // generates random number till 90
        System.out.println(num);
        for (int i = 0; i < 5; i++) {
            System.out.println("ye");
            if (i == 4) {
                System.out.println("this should not happen");
                break;// or check with break
            }System.out.println("yee");
        }
    }
}
