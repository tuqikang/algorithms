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
 * @date ：Created in 2019-07-11 21:32
 * @description：
 * @modified By：
 * @version:
 */
public class LeetCode908 {
    public int smallestRangeI(int[] A, int K) {
        int len = A.length;
        if (len == 1) {
            return 0;
        }
        int min = 0, max = 0;
        for (int i = 1; i < len; i++) {
            if (A[min] > A[i]) {
                min = i;
            } else if (A[max] < A[i]) {
                max = i;
            }
        }
        int result = A[max] - K - (A[min] + K);
        return result > 0 ? result : 0;
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode908().smallestRangeI(new int[]{0, 10}, 2));
    }
}
