/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class mother
{
    int x;
    public  void show()
    {
        System.out.println("MOHTER CLASS");
    }
}
class child extends mother
{
    
}
class Application
{
	void main() {
	mother m = new mother();
	m.show();
	child c = new child(); 
	c.show();
    Mother m1 = new child();
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