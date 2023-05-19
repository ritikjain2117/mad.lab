/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
interface Testtable
{
    void display();
}
class Test implements Testtable
{
    public void display()       //Public is necessary here
    {
        System.out.println("THIS IS TEST CLASS");   
    }
}
abstract class Abstest implements Testtable
{
    void display()
    {
        System.out.println("THIS IS TEST CLASS");
    }
}
public class Main
{
	public static void main(String[] args) {
	    Test t = new Test();
	    t.display();
	    Abstest a = new Abstest();      //Cannot Create object for Abstest class
	    a.display();
	}
}