package com.learning.linkedlist;

/**
 * Created by vperiasamy on 1/5/17.
 */
public class LinkedList<T> {

    private Node head;
    private int count;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void append(Node node) {
        if (null == head) {
            head = node;
        }

        node.setNext(head);
        head = node;
    }



    public Node reverseLinearList(Node head ) {
        if (null == head) return head;

        Node prev = null;

        Node temp = null;
        //A -> B -> C -> D -> null
        while (head != null) {
            temp = head;
            temp.setNext(prev);
            head = head.getNext();
            prev = temp;
        }

        return head;
    }


    //A -> B -> C -> D -> null
    public Node reverseRecList(Node head) {
        if (head == null) return head;
        if (head.getNext() == null) return head;

        Node retElem = reverseRecList(head.getNext());
        head.setNext(null);

        retElem.setNext(head);

        retElem = retElem.getNext();

        return retElem;
    }

    //A -> B -> C -> D -> null
    public int returnKthElem(Node head, int k) {
        if (head == null) return 0;

        int result = returnKthElem(head.getNext(), k) + 1;

        if (result == k) System.out.println(head.getData());

        return result;
    }

    //A -> B -> C -> D -> null
    public Node findKthElemFromEnd(int k, Node head) {
        if (null == head) return head;
        Node sPointer = head;
        Node fPointer = head;
        int count = 1;

        while (fPointer!= null && fPointer.getNext() != null) {
            sPointer = sPointer.getNext();
            fPointer = fPointer.getNext().getNext();
            count++;
        }

        int rem = count - k;
        while (count < rem) {
            sPointer = sPointer.getNext();
        }

        return sPointer;
    }

    // 617    217 => 7 -> 1 -> 2 -> null
    public Node sumTwoLists(Node n1, Node n2, Node result, int carry) {
        Node<Integer> result1 = new Node(0);
        if (n1 == null) {
            result1.setData(((Integer) n2.getData() + carry) % 10);
            carry = ((Integer) n2.getData() + carry) / 10;

            //sumTwoLists(n1, n2.getNext(), )
        }
        if (n2 == null) {
            result1.setData(((Integer) n2.getData() + carry) % 10);
            carry = ((Integer) n1.getData() + carry) / 10;
        }



        return null;
    }


    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        Node<String> node1 = new Node<String>("Jello");
        Node<Integer> node2 = new Node<Integer>(2);
        Node<String> node3 = new Node<String>("Hello");
        Node<String> node4 = new Node<String>("Deli");
        Node<String> node5 = new Node<String>("Bello");
        Node<String> node6 = new Node<String>("Geli");
        list.setHead(node1);
        list.append(node2);
        list.append(node3);
        list.append(node4);
        list.append(node5);
        list.append(node6);
        Node head = list.getHead();
        //System.out.println(head.getData());
        //Node revHead = list.reverseRecList(head);
        //Node revHead = revLinList.getHead();
        //Node revHead = list.reverseLinearList(head);
        //Node revHead = revList.getHead();
        //System.out.println(revHead.getNext().getData());
        System.out.println(list.returnKthElem(head, 2));







    }


}
