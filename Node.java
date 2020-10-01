package demoprograms;

import java.util.*;

public class Node {

	    int data;
	    Node link;
	    Node(){
	        this.link = null;
	    }
	}
	public class LinkedListDemo {
	    static Node head =null;
	    
	    public static void create(int date) {
	        Node temp = new Node();
	        temp.data = date;
	        temp.link =null;
	        if(head == null) {
	            head = temp;
	        } else {
	            Node p = head;
	            while(p.link != null) {
	                p = p.link;
	            }
	            p.link = temp;
	        }
	    }
	    public static void print() {
	        Node temp = head;
	        if(temp == null) {
	            System.out.println("no elements are present in the linked list");
	        } else {
	            while(temp.link != null) {
	                System.out.println(temp.data);
	                temp = temp.link;
	            }
	        }
	    }
	    public static int length() {
	        int count = 0;
	        Node temp = head;
	        if(temp == null) {
	            System.out.println("no elements are present in the linked list");
	        } else {
	            while(temp.link != null) {
	                count ++;
	                temp = temp.link;
	            }
	            count ++;
	        }
	        return count;
	    }
	    static void menu() {
	        String m = "Menu Driven Application\n"    ;
	        m += "1. Add Element \n";
	        m += "2. Display Elements \n";
	        m += "4. Number of Elements \n"; 
	        m += "3. Exit \n";
	        m += "Select any option ?";
	        System.out.println(m);
	                }
	    static void accept() {
	        System.out.println("Enter the value :");
	    }
	    public static void main(String[] args) {
	        LinkedListDemo obj = new LinkedListDemo();
	        Scanner sc = new Scanner(System.in);
	        
	        while(true) {
	            menu();
	            int choice = sc.nextInt();
	            
	            switch(choice) {
	            
	            case 1:
	                accept();
	                create(sc.nextInt());
	                break;
	            case 2:
	                print();
	                
	                break;
	            case 3:
	                System.out.println(length());
	                break;
	            case 4:
	                System.exit(0);
	                break;
	            default:
	                System.out.println("invalid Option");
	            }
	        }
	        
	    }

	 

	}

