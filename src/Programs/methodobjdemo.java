package Programs;

public class methodobjdemo {
	int rollno;  
	 String name;  
	 void insertRecord(int r, String n){  
		  rollno=r;  
		  name=n;  
		 }  
	 void displayInformation(){
		 System.out.println(rollno+" "+name);
		 }  
	 
	public static void main(String args[]){  
		methodobjdemo s1=new methodobjdemo();  
		methodobjdemo s2=new methodobjdemo();  
		s1.insertRecord(1,"Jankee");  
		s2.insertRecord(2,"Meera");  
		s1.displayInformation();  
		s2.displayInformation();  	
}
}
