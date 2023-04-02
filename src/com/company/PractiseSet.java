package com.company;

/* package com.company;
abstract class pen
{
    abstract void write();
    abstract void refill();
}
class fountainpen extends pen{
    void write()
    {
        System.out.println("please write");
    }
    void refill()
    {
        System.out.println("please refill");
    }
    void changenib()
    {
        System.out.println("changing nib");
    }
}
public class PractiseSet{
    public static void main(String[] args) {
        fountainpen pn=new fountainpen();
        pn.changenib();
        pn.refill();
    }
}*/
class monkey
{
    void Jump()
    {
        System.out.println("jumping..");
    }
    void bite()
    {
        System.out.println("bit me");
    }
}
interface basicanimal
{
    void eat();
    void sleep();
}
class Human extends monkey implements basicanimal
{
    void speak()
    {
        System.out.println("Hello sir!");
    }
    public void eat()
    {
        System.out.println("eating");
    }
    public void sleep()
    {
        System.out.println("sleeping");
    }
}
public class PractiseSet
{
    public static void main(String[] args)
    {
        Human nh=new Human();
        nh.eat();
        monkey m1=new Human();
        m1.bite();
        basicanimal love=new Human();
        love.eat();
        love.sleep();
    }
}