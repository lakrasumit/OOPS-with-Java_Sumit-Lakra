class Student {
    
    int id, age; 
    String name;
    
    
    Student() {
        id = 401;
        name = "Sumit";
        age = 20;
    }
    
    Student(int a, String b, int c) {
        id = a;
        name = b;
        age = c;
    }
    
    public void display() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(age);
        
    }
}

public class Main
{
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.display();
		
		Student s2 = new Student(402, "Lakra", 21);
		s2.display();
	}
}