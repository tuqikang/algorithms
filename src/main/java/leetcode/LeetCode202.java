package leetcode;

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
 * @date ：Created in 2019-07-15 21:46
 * @description：
 * @modified By：
 * @version:
 */
public class LeetCode202 {
    public boolean isHappy(int n) {
        int quick = n, slow = n, flag;
        while (true) {
            flag = next(quick);
            if (flag == 1) {
                return true;
            }
            flag = next(flag);
            if (flag == 1) {
                return true;
            }
            quick = flag;
            slow = next(slow);
            if (quick == slow) {
                return false;
            }
        }
    }

    private int next(int n) {
        int result = 0;
        while (n != 0) {
            int a = n % 10;
            result += a * a;
            n /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        if (new LeetCode202().isHappy(19)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
