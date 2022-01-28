import java.util.Scanner;
public class linkedlist {
    public static void insert(node<Integer> head, int ele, int pos){
        if(head == null ) {
            System.out.println("Empty linked list");
            return;
        }
        node<Integer> current = new node<Integer>(ele);
       // node<Integer> temp = head;
        node<Integer> prevnode = head;
      //  node<Integer> nextnode = temp;
        int c = 0;
        while(c < pos -1 && prevnode != null){
         //   temp = temp.next;
            c++;
            prevnode = prevnode.next;
//            if(c == pos - 1){
//                prevnode = temp;
//                nextnode = temp.next;
//                break;
//            }
//            else if( c == pos){
//                nextnode = temp;
//                break;
//            }
        }
        if(prevnode != null) {
            current.next = prevnode.next;
            prevnode.next = current;
            node<Integer> temp1 = head;
            while(temp1 != null){
                System.out.print(temp1.data + " ");
                temp1 = temp1.next;
            }
        }

    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        node<Integer> head = null;
        node<Integer> tail = null;
        int data = s.nextInt();
        while(data != -1) {
            node n1 = new node<Integer>(data);
            if(head == null) {
                head = n1;
                tail = n1;
            }
            else {
                tail.next = n1;
                tail = n1;
            }
            data = s.nextInt();
        }
        node<Integer> temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

        insert(head, 5, 10);
    }
}

class node<T>{
 T data;
 node<T> next;
 node(T data){
     this.data = data;
     next = null;
 }
}
