import java.util.Scanner;
public class linkedlist {
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
