class A{
	int x;
	static int y;
	public A(int p1, int p2){
		x = p1;
		y = p2;
	}
	public void displ(){
		System.out.println("Now X=" +x+ "Now Y=" +y);
	}
} 
public class Ex_staticvar{
	public static void main(String s[]){
		A ob1 = new A(10,20);
		ob1.displ();
		A ob2 = new A(30,40);
		ob2.displ();
		ob1.displ();
	}
}