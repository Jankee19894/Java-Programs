package Programs;

public class Unaryoperator 
{  
	public static void main(String[] args)
    {
		int num = 45; 
		boolean c=true;  
		boolean d=false;  
		int a=10;  
		System.out.println(num++);
		System.out.println(++num); 
		System.out.println(num--);
		System.out.println(--num);
		
		System.out.println(!c);  
		System.out.println(!d);
		System.out.println(~a);
    }
}     