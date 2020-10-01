package demoprograms;
import java.util.*;
public class LinkedList {
    static void menu() {
        String m = "\n Menu Driven Application\n";
        m += "1.Add Node\n";
        m += "2.Delete Node\n";
        m += "3.Display Node\n";
        m += "4.Exit\n";
        m += "Select any option \n";
        System.out.println(m);
    }

 

    public static void main(String[] args) {

 

        LinkdList obj = new LinkdList();
        Scanner sc = new Scanner(System.in);
        while (true) {
            menu();
            int choice = sc.nextInt();
            switch (choice) {
            case 1:
                System.out.println("Enter any value ?");
                LinkdList.insert(obj, sc.nextInt());
                break;
            case 2:
                System.out.println("Enter any value ?");
                LinkdList.deleteByKey(obj, sc.nextInt());
                break;
            case 3:
                LinkdList.printList(obj);
                break;
            case 4:
                System.exit(0);
                break;

 

            }

 

        } 
    }

 

}