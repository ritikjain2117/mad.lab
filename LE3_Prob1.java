/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

abstract class Bharatvanshi
{
    void fighter();
}

abstract class Pandav extends Bharatvanshi
{
    public void fighter()
    {
        System.out.println("fighter");
    }
    void obedient()
    {
        System.out.println("obedient");
    }
    void kindness()
    {
        System.out.println("kind");
    }
}
class Arjun extends Pandav
{
    void name()
    {
        System.out.println("Arjun");
    }
}
class Bheem extends Pandav
{
    void name()
    {
    System.out.println("Bheem");
        
    }
}

abstract class Kaurav
{
    void disobey()
    {
        System.out.println("disobedient");
    }
    void cruel()
    {
        System.out.println("cruel");
    }
    void Total()
    {
        System.out.println("100");
    }
}
class Vikarn extends Bharatvanshi
{
    void kind()
    {
        System.out.println("kind");
    }
    void obedient()
    {
        System.out.println("obedient");
    }
}




public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
