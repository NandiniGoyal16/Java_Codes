public class Ex_Thread2 extends Thread{
    public static void main(String[] args) throws InterruptedException{
        for(int i = 1; i <=5; i++){
            System.out.println("Value of I = " +i);
            sleep(1000);
        }
    }
}
