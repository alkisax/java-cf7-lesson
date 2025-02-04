package gr.aueb.cf.ch19.singly_linked_list;

public class SingleList<T> {
    private Node<T> head = null; //δημιουργουμε μια κενή λίστα

    public SingleList(){}

    public void insertFirst (){}
    /**
     * Time complexity O(n)
     * @param t the value to be inserted.
     */
    //για να φτιάξω node στην αρχή. φτιαχνω tmp node αυτό πρέπει να δείχνει εκεί που δείχνει το head Και το head να αλλάξει να δείχνει εκεί που είναι ο tmp
    public void insertFirst(T t) {
        //1ο βήμα δημιουργούμε τον κόνβο
        Node<T> tmp = new Node<>();
        tmp.setItem(t);
        tmp.setNext(head); //δείχνει στον head
        head = tmp; // και ο Head sto νεο node
    }

    /**
     * Time complexity O(n)
     * @param t the value to be inserted.
     */
    // Για να εισάγω Node στο τέλος. Δημιουργώ έναν κόμβο Tmp, σαν next θα είναι Null γιατί είναι στο τέλος. Τι θα γίνει με τον Head και τι θα γίνει με τον τελευταίο (αν υπάρχει); Αν δεν υπαρχει είναι σαν να μπαίνει στην αρχή. Αν υπαρχει ο head δεν χρειάζετε να αλλάξει έτσι και αλλιώς δείχνει στον πρώτο. Διατρέχουμε την λίστα μέχρι τον τελευταίο δηλαδή μέχρι ο κόμβος να έχει Next null
    public void insertLast(T t) {
        Node<T> tmp = new Node<>(); // φτιαχνω νέο κόμβο
        tmp.setItem(t); // βάζω περιεχόμενα
        tmp.setNext(null); // next κενο

        if (isEmpty()) { // για αδεια λίστα
            insertFirst(t);
            return;
        }

        Node<T> n;
        for (n = head; n.getNext() != null; n = n.getNext()) { // απο την αρχή (head) ως το null, και σε κάθε βήμα γίνετε next (εδω οχι μονο δεν έχει ι++ αλλά έχει και κάτι με =)

        }
        n.setNext(tmp);
    }


    /**
     * Time complexity O(1)
     * @return  the removed node.
     */
    //    για διαγραφή του πρώτου. το Head πρεπει να γίνει head.next. το πρωτο στοιχείο δεν διαγράφθηκε απο το heap θα το κάνει ο garbage collector
    public Node<T> removeFirst() {
        if (isEmpty()) return null; //το node<T> μπήκε για να επιστρέψει και να δουμε και τον κόμβο που διαγράφει

        Node<T> node = head; // πρώτα αποθηκεύουμε κάπου τον νοουντ που είναι να σβηστει γατι μετά θα τον χασουμε
        head = head.getNext();
        return node;
    }

    /**
     * Time-complexity O(n)
     * @return the removed node.
     */

    // για διαγραφή απο το τέλος. πρέπει να φτάσουμε στον ΠΡΟΤΕΛΕΥΤΑΙΟ ωστε του προτελευταιου το νεξτ να γίνει null.Αν είναι κενή δεν κάνεις τίποτα. Αν είναι η λίστα έχει μόνο ένα τοτε το κάνω με removeFirst.
    public Node<T> removeLast() {
        if (isEmpty() || head.getNext() == null) { //αν η λίστα ειναι κενή
            return removeFirst();
        }

        Node<T> n; // φτιαχνω ενα νοουντ gia na κάνει την διατρεξη στον πίνακα
        for (n = head; n.getNext().getNext() != null; n = n.getNext()) { // εδώ βαλαμε το next next για το προτελευταιο (δηλ ο n apo to  n = n.getNext())
        }

        Node<T> nodeToReturn = n.getNext();
        n.setNext(null);
        return nodeToReturn;
    }

    /**
     * Time-complexity O(n)
     * @param t the value to search for.
     * @return  the node that contains the value,
     *          null otherwise.
     */
    public Node<T> get(T t) {
        Node<T> nodeToReturn = null; // φτιαχνω έναν κόμβο που θα διατρέξει όλη την λίστα μέχρι τον τελευταιο. Δηλ αυτων που έχει N null (και οχι next null)

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

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        int counter = 0;

        for (Node<T> n = head; n != null; n = n.getNext()) {
            counter++;
        }

        return counter;
    }
}
