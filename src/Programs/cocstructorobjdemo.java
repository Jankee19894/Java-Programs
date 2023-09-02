package Programs;

public class cocstructorobjdemo {
	 int id;  
	 String name;  
	 float salary;  
	 void insert(int i, String n, float s) {  
	        id=i;  
	        name=n;  
	        salary=s;  
	    } 
	 void display(){
		 System.out.println(id+" "+name+" "+salary);
		 }  
	public static void main(String args[]){  
		cocstructorobjdemo e1=new cocstructorobjdemo();  
		cocstructorobjdemo e2=new cocstructorobjdemo();  
	    e1.insert(1,"Jankee",45000);  
	    e2.insert(2,"Meera",25000);  
	    e1.display();  
	    e2.display();    
}
}
