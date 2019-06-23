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
 * @date ：Created in 2019-06-23 20:59
 * @description：输出链表中的倒数第K个节点(即正数第K-1个节点),可以使用两个节点完成,倒数第K，相当于第一个指针先走K-1步，然后第二个指针再一起走;
 * @modified By：
 * @version:
 */
public class RGetNode {

    public static Node<Integer> rGet(Node<Integer> head, int k) {
        Node fast = head;
        Node slow = head;
        int i = 0;
        for (; i < k - 1; i++) {
            fast = fast.next;
            if (fast == null) {
                System.out.println("k值溢出");
                return null;
            }
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node<Integer> nonCircle = LinkUtils.getNonCircle();
        System.out.println(rGet(nonCircle, 10).e);
        while (nonCircle != null) {
            System.out.print(nonCircle.e + "\t");
            nonCircle = nonCircle.next;
        }
    }
}
