class Areas {
    
    int a;
    
    public void square(int a) {
        System.out.println(a * a);
    }
    
    public void square(int a, int b) {
        System.out.println(a * b);
    }
}

public class Main
{
	public static void main(String[] args) {
		
		Areas a = new Areas();
		
		a.square(4);
		a.square(4, 5);
	}
}