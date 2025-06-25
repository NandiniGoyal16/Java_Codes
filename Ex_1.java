class A{
	int x = 10;
	public void show(){
		System.out.println("X="+x);	
	}
	public void show(int p1){
		x =p1;
		System.out.println("Now X = "+x);
		//System.out.println("Instance X = "+this.x);
	}
}
public class Ex_1{
	public static void main(String s[]){
		A ob1 = new A();
		ob1.show();
		ob1.show(1234);
		ob1.show();
	}
}