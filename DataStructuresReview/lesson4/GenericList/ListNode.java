package DataStructuresReview.lesson4.GenericList;

public class ListNode<E> {
    E data;
    ListNode<E> nextNode;

    ListNode(E object) {
        this(object, null);
    }

    ListNode(E object, ListNode<E> node) {
        data = object;
        nextNode = node;
    }

    private E getData() {
        return data;
    }


    private ListNode<E> getNext() {
        return nextNode;
    }


}
