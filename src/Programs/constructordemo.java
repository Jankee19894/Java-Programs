package Programs;

public class constructordemo {
	int  value1;
    int  value2; 
    constructordemo(){
        value1 = 10;
        value2 = 20;
        System.out.println("Inside Constructor");
    }
    public void display(){
        System.out.println("Value1 === "+value1);
        System.out.println("Value2 === "+value2);
    } 
	public static void main(String args[]){  
		constructordemo d1 = new constructordemo();
	      d1.display();    
}
}
