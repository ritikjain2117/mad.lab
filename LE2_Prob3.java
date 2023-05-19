/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class mother
{
    int x;
    public void show()
    {
        System.out.println("MOHTER CLASS");
    }
}
class child extends mother
{
    public  void show()
    {
        System.out.println("CHILD CLASS");
    }
    
}
class Application
{
	void main() {
	mother m = new mother();
	m.show();
	child c = new child(); 
	c.show();
	mother m1 = new child();//print the function in class child
    m1.show();
}
}
public class Main
{
	public static void main(String[] args) {
        Application a=new Application();
        a.main();
}
}


// IF any one of the fucntion is static then ti will give error canncot Override the function
// If both will be static then the output will be mother , child ,mother
// If both are normal then the output will be mother child ,child