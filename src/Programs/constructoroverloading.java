package Programs;

public class constructoroverloading {
	int  value1;
    int  value2; 
    constructoroverloading(){
    	value1 = 10;
        value2 = 20;
        System.out.println("Inside 1st Constructor");
    }
    constructoroverloading(int a){
        value1 = a;
        System.out.println("Inside 2nd Constructor");
      }
    constructoroverloading(int a,int b){
        value1 = a;
        value2 = b;
        System.out.println("Inside 3rd Constructor");
       }
    public void display(){
        System.out.println("Value1 === "+value1);
        System.out.println("Value2 === "+value2);
    }
	public static void main(String args[]){  
		constructoroverloading d1 = new constructoroverloading();
		constructoroverloading d2 = new constructoroverloading(30);
		constructoroverloading d3 = new constructoroverloading(30,40);
	    d1.display();
	    d2.display();
	    d3.display();
}
}
	