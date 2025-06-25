class A{
	int x;
	public A(){
		x = 10;
	}
	public void display(){
		System.out.println("X= "+x);
	}	
}
class B extends A{
	int y;
	public B(){
		y = 20;
	}
	public void display(){
		System.out.println("Y= "+y);
		System.out.println("Sum ="+(x+y));
		System.out.println("Sum= "+(x+x));
		System.out.println("Sum= "+(super.x+x));
	}
}
public class superkey{
	public static void main(String s[]){
		B ob1 = new B();
		ob1.display();
	}
} 