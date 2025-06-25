class A{
	int x;
	public A(){
		x = 10;
		System.out.println("X =" +x);
	}
	public A(int p1){
		x = p1;
	}
	public void show(){
		System.out.println("Now X=" +x);
	}
} 
public class constructor{
	public static void main(String s[]){
		A ob1 = new A();
		ob1.show();
		A ob2 = new A(12345);
		ob2.show();
	}
} 