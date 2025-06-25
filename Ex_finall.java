class A{
	final int x;
	public void show(){
		System.out.println("X=" +x);
	}
	public A(){
		x = 10;
	}
}
public class Ex_finall{
	public static void main(String s[]){
		A ob1 = new A();
		//ob1.x = 1234;
		ob1.show();
	}
}