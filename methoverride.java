class A{
	int x;
	public A(){
		x = 10;
	}
	public void show(){
		System.out.println("x in A =" +x);
	}
} 
class B extends A{
	int y;
	public B(){
		y = 20;
	}
	public void show(){
		System.out.println("y in B=" +y);
		//A ob1 = new A();
		//ob1.show();
	}
}
public class methoverride{
	public static void main(String s[]){
		B ob2 = new B(); 
		ob2. show();
	}
}
 
