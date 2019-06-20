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
 * @date ：Created in 2019-06-20 16:00
 * @description：在有序链表中寻找中位数
 * @modified By：
 * @version:
 */
public class FindMedian {

    public static double median(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null) {
            if (fast.next == null) {
                return Double.valueOf((Integer) slow.e);
            } else if (fast.next.next == null) {
                Integer a = Integer.valueOf((Integer) slow.e);
                Integer b = Integer.valueOf((Integer) slow.next.e);
                return (a + b) / 2.0;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return (double) slow.e;
    }

    public static void main(String[] args) {
        System.out.println(median(LinkUtils.getNonCircle()));
    }
}
