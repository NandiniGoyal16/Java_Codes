public class Ex_Thread1 extends Thread{
    public static void main(String[] args){
        Thread th = Thread.currentThread();
        System.out.println("Status= "+th);
        System.out.println("Name= "+th.getName());
        System.out.println("Priority= "+th.getPriority());
        th.setName("Thread1");
        th.setPriority(8);
        System.out.println("Now Status= "+th);
    
    }
}
