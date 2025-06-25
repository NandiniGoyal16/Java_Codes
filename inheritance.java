class A{
	int x = 10;
	public void show(){
		System.out.println("X= "+x);
	}
}
class B extends A{
	int y = 20;
	public void display(){
		A ob1 = new A();
		ob1.show();
		System.out.println("Y= "+y);
	}
}
public class inheritance{
	public static void main(String s[]){
		B ob2 = new B();
		ob2.display();
		ob2.show();
	}
}