package gr.aueb.cf.ch19.doubly_linked_list;

public class DoublyLinkedList<T> {
    private Node<T> head = null;
    private Node<T> tail = null;

    public DoublyLinkedList(){}

    //φτιαχνω νέο κόμβο, τον next α δείχνει στο head και το prev στο null.
    //στη συνέχεια ο head θα πρέπει να δείξει στον νεό πρωτο κόμβο
    //ο tail έχει πρόβλημα μονα αν η λίστα είναι άδεια και τόττε θα πρέπει να δείχνει και αυτός στον tmp
    public void insertFirst (T t) {
        Node<T> tmp = new Node<>();
        tmp.setItem(t);
        tmp.setNext(head);
        tmp.setPrev(null);

        if (head == null) {
            tail = tmp;
        } else{
            head.setPrev(tmp);
        }
        head = tmp;
    }

    // για το τελος φτιαχνω έναν κόμβο. ως Next to null και ως prev το tail. Ο tail μετα πρέπει να πάει στον tmp. Το head δεν επιρεαζετε αν υπάρχει έστω και ένα στοιχείο στην λίστα.
    public void insertLast(T t) {
        if (head == null) {
            insertFirst(t);
            return;
        }
        Node<T> tmp = new Node<>();
        tmp.setItem(t);
        tmp.setNext(null);
        tmp.setPrev(tail);

        tail.setNext(tmp);

        tail = tmp;
    }


    /**
     * Time-complexity O(1)
     * @return  the removed node.
     */

    //Μετακοινουμε το head στο head next και το παίρνει ο garbage collector.
    //αν δεν υπάρχει κανένα δεν αλλαζει κατι. αν υπάρχει ένα πρέπει και ο tail να δειξει στο ιδιο
    public Node<T> removeFirst() {
        Node<T> nodeToReturn;

        //φτιαξαμε μια βοηθητικη isEmpty
        if (isEmpty()) return null;

        nodeToReturn = head;
        //δηλ ελέγχω αν είναι ένα μόνο
        if (head.getNext() == null) tail = null;
        head = head.getNext();
        head.setPrev(null);
        return nodeToReturn;
    }

    /**
     * Time-complexity O(1)
     * @return  the removed node.
     */
    // το tail πρεπει να πάει στο προηγούμενο. και ο προτελευταιός να βαλει ως next null(δηλαδη να αποκοπεί το τελευταιο)
    public Node<T> removeLast() {
        Node<T> nodeToReturn;
        if (isEmpty() || head.getNext() == null) {
            return removeFirst();
        }

        nodeToReturn = tail;
        tail = tail.getPrev();
        tail.setNext(null);
        return nodeToReturn;
    }

    public Node<T> get(T t) {
        Node<T> nodeToReturn = null;
        // an n=null τοτε φτάσαμε στο τελευταίο οταν n!=null είμαστε προτελευταίο και μετά n.getNext και φτάνει τελευταίο
        for (Node<T> n = head; n != null; n = n.getNext()) {
            if (n.getItem().equals(t)) {
                nodeToReturn = n;
                break;
            }
        }
        return nodeToReturn;
    }

    /**
     * Time-complexity O(n)
     */
    public void traverse() {
        for (Node<T> n = head; n != null; n = n.getNext()) {
            System.out.println(n.getItem());
        }
    }

    /**
     * Time-complexity O(n)
     */
    public void traverseReverse() {
        for (Node<T> n = tail; n != null; n = n.getPrev()) {
            System.out.println(n.getItem());
        }
    }

    public boolean isEmpty() {
        return head == null;
    }
}
