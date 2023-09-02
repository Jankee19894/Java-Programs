package Programs;

public class breakstatementdemo {
	public static void main(String args[]){  
		for (int i = 1; i <= 10; ++i) {

            // if the value of i is 5 the loop terminates  
            if (i == 3) {
                break;
            }      
            System.out.println(i);
        }   
}
}
