package data.structure.link;

/**
 * █████▒█      ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * ░     ░░▒░ ░ ░   ░  ▒   ░ ░▒ ▒░
 * ░ ░    ░░░ ░ ░ ░        ░ ░░ ░
 * ░     ░ ░      ░  ░
 *
 * @author ：涂齐康
 * @date ：Created in 2019-06-15 14:36
 * @description：链表
 * @modified By：
 * @version:
 */
public class LinkList<E> {

    private Node<E> dummyHead;

    private int size;

    public LinkList() {
        dummyHead = new Node();
        size = 0;
    }

    public void add(int index, E e) {
        valit(index);
        Node<E> prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        prev.next = new Node(e, prev.next);
        size++;
    }

    public void addFirst(E e) {
        add(0, e);
    }

    public E get(int index) {
        valit(index);
        Node<E> cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.e;
    }

    public E getFirst() {
        return get(0);
    }

    public E getLast() {
        return get(this.size - 1);
    }

    public int size() {
        return this.size;
    }

    public E set(int index, E e) {
        valit(index);
        Node<E> cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        E result = cur.e;
        cur.e = e;
        return result;
    }

    public void valit(int index) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException("index out");
        }
    }

    public E remove(int index) {
        Node<E> prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        Node<E> result = prev.next;
        prev.next = result.next;
        E e = result.e;
        size--;
        result = null;
        return e;
    }

    public void display() {
        Node<E> cur = dummyHead.next;
        for (; cur != null; cur = cur.next) {
            System.out.print(cur.e);
        }
        System.out.println();
    }

    private static class Node<E> {
        E e;
        Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this.e = e;
            this.next = null;
        }

        public Node() {
            this.e = null;
            this.next = null;
        }
    }
}
