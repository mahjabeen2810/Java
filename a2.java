package c2;
import c1.*;
public class a2
{
	a2()
	{
		a1 ob=new a1();
		System.out.println("Different package non sub-class");
		System.out.println("Square of 5= "+ob.s*ob.s);
	}
}