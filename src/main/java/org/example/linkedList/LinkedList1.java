package org.example.linkedList;

class ListNode{
    String data;
    ListNode next;

    ListNode(String data){
        this.data =data;
        this.next =null;
    }
}
public class LinkedList1 {
    // Creating linked list with Node.
        public static void main(String[] args) {
            ListNode a=new ListNode("Hello");
            ListNode b=new ListNode("World");
            ListNode c=new ListNode("Linked");
            ListNode d=new ListNode("List");
            ListNode e=new ListNode("Project");

            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            System.out.println(a);
            System.out.println(a.next);//The value is the address of b.
            System.out.println(b);//The address of b node.

            ListNode head = a;
            ListNode currNode = head;
            System.out.println(currNode.next.next.data);
            while(currNode.next != null)
            {
                System.out.print(currNode.data +" -> ");
                currNode=currNode.next;
            }
            System.out.println("NULL");
        }
}
