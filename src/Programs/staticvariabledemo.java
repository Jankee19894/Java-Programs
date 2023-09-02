package Programs;

public class staticvariabledemo {
	int rollno;
	String name;  
    static String college ="Venus";
    staticvariabledemo(int r, String n){  
    	   rollno = r;  
    	   name = n;  
    }  
    void display(){
    	System.out.println(rollno+" "+name+" "+college);
    }  
    
	public static void main(String args[]){  
		staticvariabledemo s1 = new staticvariabledemo(1,"Jankee");  
		staticvariabledemo s2 = new staticvariabledemo(2,"Meera");  	
		 s1.display();  
		 s2.display();  
}
}
	