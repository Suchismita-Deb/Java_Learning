package org.example.DailyDrill.linkedList;

public class SinglyLinkedList {

    ListNode head;
    public static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data){
        ListNode newNode = new ListNode(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }


    public void addLast(int data){
        ListNode newNode = new ListNode(data);
        ListNode currNode = head;
        while(currNode.next!=null)
        {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    public void display()
    {
        ListNode currNode = head;
        while(currNode!=null)
        {
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }


    public static void main(String[] args) {
        SinglyLinkedList l1 = new SinglyLinkedList();
        l1.addFirst(10);
        l1.addLast(20);
        l1.addLast(30);

        l1.display();
    }

}
