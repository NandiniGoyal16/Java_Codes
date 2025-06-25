interface IA{
    public void show();
    public void cal(int p1, int p2);
}
class A implements IA{
    int x = 10;
    public void show(){
        System.out.println("Value of x in A="+x);
    }
    public void cal(int p1, int p2){
        System.out.println("Sum=" +(p1+p2));
    }
}
public class interface1{
    public static void main(String[] args) {
        A ob1 = new A();
        ob1.show();
        ob1.cal(2,3);
    }
}