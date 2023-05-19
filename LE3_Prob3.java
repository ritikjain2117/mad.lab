/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

interface Ducks
{
    void fly();
    void squeaks();
    void mute();
    void swim();
    void quack();
}
class Rd implements Ducks
{
    public void squeaks()
    {
        System.out.println("squeaks");
    }
    public void swim()
    {
        System.out.println("swim");
    }
}

class Wd implements Ducks
{
    public void swim()
    {
        System.out.println("swim");
    }
    public void mute()
    {
        System.out.println("mute");
    }
    
}

class RHD implements Ducks
{
    public void quack()
    {
        System.out.println("quack");
    }
    public void swim()
    {
        System.out.println("swim");
    }
}

class CD implements Ducks

{
    public void swim()
    {
        System.out.println("swim");
    }
    public void quack()
    {
        System.out.println("quack");
    }
}


public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
