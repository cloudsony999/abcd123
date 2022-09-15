import static java.lang.Math.cos;
import static java.lang.System.out;
import static java.lang.String.valueOf;
import java.util.*;
class Demo
{
public static void main(String args[])throws Exception
{
	info();
}
static void info()throws Exception
{
out.println("java version is "+System.getProperty("java.version"));
out.println("OS is "+System.getProperty("os.name"));
out.println("user logged in is "+System.getProperty("user.name"));
//Thread.sleep(3000);
out.println("JVM is  "+System.getProperty("java.vm.name"));
out.println("Vendor is  "+System.getProperty("java.vendor"));
out.println(cos(0));
out.println("amitava"+valueOf(12));

String f[]=new String[5];
Arrays.fill(f,"Hello");
out.println(f[3].charAt(0)+"  "+f.toString());

}
}
/*
class S
{
	S(int a,double d)
	{
		System.out.println("1");
	}
	S(double s,int d)
	{
		System.out.println("2");
	}
	public static void main(String args[])
{
	new S(12,34);
}
}
*/


class W
{
	void d()
	{
	}
}

class E extends W
{
	void d()
	{
		super.d();
	}

public static void main(String args[])throws Exception
{
	//super.d();
}
}

class T
{
	public static void main(String args[])
	{
		try
		{
			int x=10/0;
			
			
		}
		catch(ArithmeticException w)
		{
			System.out.println("1");
			//throw new NumberFormatException();
		}
		catch(NumberFormatException e)
		{
			System.out.println("2");
		}
		System.out.println("end of main");
	}
}

		class K implements Runnable
		{
			public void run()
			{
			}
		}
		class Q
		{
			public static void main(String args[])
	{
		//Thread t=new Thread(new K());
		//t.start();
		//t.start();
		byte b1=(byte)127.0;
		System.out.println(b1);
		long h=(byte)100;
		System.out.println(h);
		byte h1=(byte)100L;
		System.out.println(h1);
		int r=(int)99.99f;
		System.out.println(r);
		
	}
		}
		
	