import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Keys = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String name = Keys.next();
        System.out.println("Enter your last name:");
        String last = Keys.next();
        System.out.println("/\\/\\/\\/\\/\\/\\");
        System.out.println(name  +" "+  last);
        System.out.println(last+  ", "  +  name);
        System.out.println("/\\/\\/\\/\\/\\/\\");
    }
}