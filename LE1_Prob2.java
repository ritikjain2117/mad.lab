/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		for(int i=0;i<4;i++)
		{
		    for(int k=0;k<4-i-1;k++)
		    {
		        System.out.print(" "); 
		    }
		    for(int j=0;j<i+1;j++)
		    {
		        System.out.print("* ");
		    }

		        
		    System.out.print("\n");
		    
		}
	}
}
