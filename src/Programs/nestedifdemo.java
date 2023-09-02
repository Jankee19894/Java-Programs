package Programs;

public class nestedifdemo {
	public static void main(String args[]){  
		int n=24;
        if (n % 2 == 0){
            System.out.print("This number is even....");
            if (n % 6 == 0) {
                System.out.println("and divisible by 6");
            } else {
                System.out.println("and not divisible by 6");
            }
        } 
        else {
            System.out.println("This number is odd....");
            if(n % 3 == 0) {
                System.out.println("and divisible by 3");
            } else {
                System.out.println("and not divisible by 3");
            }
        }
 
}
}
