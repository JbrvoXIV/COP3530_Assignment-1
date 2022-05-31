public class Main {
    
    public static void removeValuesLargerThanMax(SinglyLinkedList list, int max) { // LinkedList Programming Part, Question 1
        if(list.head == null) { // empty list
            throw new NullPointerException("List is empty.");
        }

        Node curNode = list.head;
        Node searchNode = curNode;

        while(searchNode.next != null) {
            searchNode = searchNode.next;
            if((int)searchNode.data <= max) { // advance searchNode until a val less than max is found, assign curNode.next to said val
                curNode.next = searchNode;
                curNode = curNode.next;
            }
            if(searchNode.next == null && (int)searchNode.data > max) { // last val is greater than max, therefore set curNode.next to null
                curNode.next = null;
                curNode = curNode.next;
            }
        }

        if((int)list.head.data > max) { // in case head > max, make head next. Works for when head.next is null, making list empty
            list.head = list.head.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList(
            new Node(5, new Node(10, new Node(15, new Node(7, new Node(3, new Node(27, new Node(14, new Node(1))))))))
        );
        removeValuesLargerThanMax(list, 13);
        System.out.printf("%s\n", list.toString());
    }
}