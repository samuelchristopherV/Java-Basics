package simpleprograminjava;

public class Function {
	public int addition (int a, int b) {
		return a+b;
	}
    public int subraction (int a, int b) {
    	return a-b;
    }
public static void main(String[]args) {
	Function obj= new Function();
	int add = obj.addition(12, 43);
	int sub = obj.subraction(33, 47);
	System.out.println(add);
}    
}
