/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    
    if(head == null) // list does not exist..so no loop either.
        return false;

    Node slow, fast; // create two references.

    slow = fast = head; // make both refer to the start of the list.

    while(true) {

        slow = slow.next;          // 1 hop.

        if(fast.next != null)
            fast = fast.next.next; // 2 hops.
        else
            return false;          // next node null => no loop.

        if(slow == null || fast == null) // if either hits null..no loop.
            return false;

        if(slow == fast) // if the two ever meet...we must have a loop.
            return true;
    }
   /*
    System.out.println("Inside function: ");
    if(head == null)
        return false;
    
    if(head.next == null)
        return false;
    
    if(head.next == head)
        return true;
    
     Set<Integer> numbers = new HashSet<Integer>();
    boolean flag = false;
    while(head != null) {
        
        int value = head.data;
        System.out.println("Value is: " + head.next);
        Boolean f = numbers.contains(value);
        
        if(f == false) {
            numbers.add(value);
        } else {
            flag = true;
            break;
        }
        
        head = head.next;
    }
    
    if(flag) {
        return true;
    } else {
        return false;
    }
    */
}
