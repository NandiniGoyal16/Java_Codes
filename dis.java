import java.io.*;
public class dis{
    public static void main(String[] args) throws IOException {
        String sname;
        int age;
        int contact;
        DataInputStream ob = new DataInputStream(System.in);
        System.out.println("Enter name:");
        sname = ob.readLine();
        System.out.println("Enter age:");
        age = Integer.parseInt(ob.readLine());
        System.out.println("Enter contact num:");
        contact = Integer.parseInt(ob.readLine());
        System.out.println("name:"+sname+"Age:"+age+"Contact:"+contact);
    }
}
