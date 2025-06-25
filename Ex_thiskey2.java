class A{
	int x = 10;
	public void show(){
		System.out.println("X="+x);	
	}
	public void show(int x){
		this.x = x;
		System.out.println("Now X = "+x);
		//System.out.println("Instance X = "+x);
	}
}
public class Ex_thiskey2{
	public static void main(String s[]){
		A ob1 = new A();
		ob1.show();
		ob1.show(1234);
		ob1.show();
	}
}