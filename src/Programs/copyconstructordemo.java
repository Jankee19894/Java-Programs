package Programs;

public class copyconstructordemo {
	private int ID;   
    private String Name;
    copyconstructordemo(int id, String name)//parameterized constructor
    {
        ID=id;
        Name=name;
    }
    copyconstructordemo(copyconstructordemo student)//copy constructor  
    {   
        System.out.println("The Copy Constructor Starts here");
        ID=student.ID;//getters  
        Name=student.Name;//getters
    }   
    int showID()
    {
        return ID;
    }
    String showName()
    {
        return Name;
    }
	public static void main(String args[]){  
		copyconstructordemo s=new copyconstructordemo(1,"ABC");
        System.out.println("ID of student: "+ s.showID()+ " Name of student:"+ s.showName());
        copyconstructordemo s1 = new copyconstructordemo(s);
        System.out.println("ID of student: "+ s1.showID()+ " Name of student:"+ s1.showName());
}
}
	