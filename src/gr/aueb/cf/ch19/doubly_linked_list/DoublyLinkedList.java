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
}
