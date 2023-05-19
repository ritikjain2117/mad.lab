/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class mother 
{
    public void show()
    {
        System.out.println("mother");
    }
}
class child extends mother 
{
    public void show()
    {
        System.out.println("child");
    }
}
public class Main
{
	public static void main(String[] args) {
		child c = new child();
		c.show();                            // OUTPUT IS child
		mother m = new mother();
		m.show();                            // OUTPUT IS mother
	}
}
