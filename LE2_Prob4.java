/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class A 
{
    int y;
    public A(int x)
    {
        y=x;
    }
    public void get()
    {
        System.out.println(y);
    }
}
class B extends A 
{
    //IF THERE IS NO CONSTRUCTOR IN DERIVED CLASS WHILE THERE IS AN PARAMETARIZED CONSTRUCTOR IN BASE CLASS THERE WILL BE  AN ERROR BECAUSE THERE WILL BE
    // NO PARAMETER PASSED TO THE BASE CLASS CONSTRUCTOR TO SOLVE THAT WE MAKE A CONSTRUCTOR IN DERIVED CLASS WITH SUPER() FUNCTION IN IT 
    public B()
    {
        super(3);
    }
}
public class Main
{
	public static void main(String[] args) {
        B b = new B();
        b.get();
    }
}