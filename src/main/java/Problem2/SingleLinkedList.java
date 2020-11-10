package Problem2;

import java.util.List;

// all functions assume using dummy node
public class SingleLinkedList {
    // do not add member variables
    private ListNode head;
    private int size;

    public SingleLinkedList() {
        head = new ListNode();
    }

    // copy constructor -> NOW DONE YAY
    public SingleLinkedList(SingleLinkedList list) {
        //BAD INPUT!
        if (list == null){
            return;
        }

        //THE DUMMY NODE
        ListNode ptrCopy = new ListNode();
        head = ptrCopy;

        //USING A PTR TO POINT TO THE ORIGINAL AT 1
        ListNode ptrOrig = list.head.next;

        //VISUAL INTERPRETATION
        //ptrCopy -> node(1)
        while (ptrOrig != null){
            //PUTTING THE VALUE FROM THE ORIGINAL INTO THE NEXT NODE AFTER THE DUMMY NODE
            //IN THE NEW COPY LINKEDLIST
            ptrCopy.next = new ListNode(ptrOrig.val);
            ptrCopy = ptrCopy.next;
            ptrOrig = ptrOrig.next;
        }
        size = list.size;
    }

    //
    public int removeAll(int valueToRemove) {
        // homework
        int count = 0;
        ListNode p = head;
        while(p.next != null){
            if(p.next.val == valueToRemove){
                p.next = p.next.next;
                size--;
                count++;
                continue;
            }
            p = p.next;
        }
        return count;
    }

    // reverse the linked list nodes iteratively (no recursion)
    public void reverse() {
        // homework
        ListNode first = head.next;
        if(first == null){
            return;
        }
        ListNode swap = first.next;
        while(swap != null){
            first.next = swap.next;
            swap.next = head.next;
            head.next = swap;
            swap = first.next;
        }
    }

    // do not change any function below
    public SingleLinkedList(int[] data) {
        this();
        if (data == null) {
            return;
        }
        ListNode ptr = head;
        for (int datum : data) {
            ptr.next = new ListNode(datum);
            ptr = ptr.next;
            size++;
        }
    }

    // Appends the specified element to the end of this list
    public void add(int val) {
        size++;
        ListNode ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = new ListNode(val);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        ListNode ptr = head.next;
        while (ptr != null) {
            builder.append(ptr.val).append(ptr.next == null ? " -> end " : " -> ");
            ptr = ptr.next;
        }
        return builder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof SingleLinkedList)) {
            return false;
        }

        SingleLinkedList otherList = (SingleLinkedList) obj;

        if (this.size != otherList.size) {
            return false;
        }
        ListNode n1 = head.next;
        ListNode n2 = otherList.head.next;
        while (n1 != null && n2 != null) {
            if (n1.val != n2.val) {
                return false;
            }
            n1 = n1.next;
            n2 = n2.next;
        }
        return (n1 == null && n2 == null);
    }

    public int getSize() {
        return size;
    }
}
