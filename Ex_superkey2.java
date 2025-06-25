class A{
    int x;
    public A(){
        x = 10;
    }
    public void displ(){
        System.out.println("X=" +x);
    }
}
class B extends A{
    int y;
    public B(){
        y = 20;
    }
    public void displ(){
        super.displ();
        System.out.println("Y=" +y);
    }
}
class C extends B{
    int z;
    public C(){
        z = 30;
    }
    public void displ(){
        super.displ();
        System.out.println("Z=" +z);
    }
}
public class Ex_superkey2{
    public static void main(String[] args) {
        C ob1 = new C();
        ob1.displ();
    }
}