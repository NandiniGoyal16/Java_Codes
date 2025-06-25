class A{
	public void displ(){
		System.out.println("DISP");
	}
	public static void show(){
		A ob = new A();
		ob.displ();
		System.out.println("SHOW");
	}
}
public class staticmeth{
	public static void main(String s[]){
		A ob1 = new A();
		A.show();
		ob1.show();
		ob1.displ();
	}
} 