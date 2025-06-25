class A{
    int x;
    public A(){
        x = 20;
    }
    public void disp(){
        System.out.println("X="+x);
    }
}
class B extends A{
    int y;
    public B(){
        y = 30;
    }
    public void disp(){
        super.disp();
        System.out.println("Y="+y);
    }
}
public class supermeth{
    public static void main(String[] args) {
        B ob = new B();
        ob.disp();
    }
}


