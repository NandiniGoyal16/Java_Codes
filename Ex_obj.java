class A{
	int x = 10;
	void displ(){
		System.out.println("Value of x = " +x);
	}
}
class Ex_obj{
	public static void main(String s[]){
		A ob1 = new A();
		ob1.x = 111;
		ob1.displ();
		A ob2 = new A();
		ob2.displ();
	}
}