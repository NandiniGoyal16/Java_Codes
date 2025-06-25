class A{
	int x = 10;
	public void show(){
		System.out.println("X=" +x);
	}
 
	public void show(int p1){
		x= p1;
		System.out.println("Now X=" +x);

	}
}

public class methoverload{
	public static void main(String s[]){
		A ob1 = new A();
		ob1.show();
		ob1.show(111);
	}
} 