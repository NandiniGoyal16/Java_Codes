class A{
    int x;
    public A(){
        x = 10;
        System.out.println("Va;ue of x in parent consrtuctor="+x);
    }
}
class B extends A{
    int y;
    public B(){
        super();
        y = 20;
        System.out.println("Value of y in child construtor="+y);
    }
}
public class supercons{
    public static void main(String[] args) {
        B ob = new B();
    }
}