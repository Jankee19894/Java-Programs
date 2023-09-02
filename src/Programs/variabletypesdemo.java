package Programs;

public class variabletypesdemo 
{  
	static int c= 40;
	int a= 10;
	public static void main(String[] args)
    {
        int var = 20;
        System.out.println("Local Variable: " + var);
        System.out.println("Static Variable: " + c);
        variabletypesdemo myinstance = new variabletypesdemo();
        System.out.println("Instance Variable: " + myinstance.a);
    }
}     