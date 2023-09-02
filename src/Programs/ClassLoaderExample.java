package Programs;

public class ClassLoaderExample  
{  
    public static void main(String[] args)  
    {  
    	ClassLoader loader = String.class.getClassLoader();
        System.out.println("Class loader for String class: " + loader); 
    }  
}     