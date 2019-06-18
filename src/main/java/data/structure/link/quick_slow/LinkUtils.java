package data.structure.link.quick_slow;

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
 * @date ：Created in 2019-06-18 14:34
 * @description：
 * @modified By：
 * @version:
 */
public class LinkUtils {

    public static Node<Integer> getNonCircle() {
        Node<Integer> node = new Node<>(0);
        Node head = node;
        for (int i = 1; i < 10; i++) {
            node.next = new Node<>(i);
            node = node.next;
        }
        return head;
    }

    public static Node<Integer> getCircle() {
        Node<Integer> node = new Node<>(0);
        Node head = node;
        for (int i = 1; i < 8; i++) {
            node.next = new Node<>(i);
            node = node.next;
        }
        Node flag = new Node(100);
        node.next = flag;
        flag.next = node;
        return head;
    }
}
