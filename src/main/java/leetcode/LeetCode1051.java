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
 * @date ：Created in 2019-06-23 21:21
 * @description：
 * @modified By：
 * @version:
 */
public class LeetCode1051 {

    public int heightChecker(int[] heights) {
        int[] same = new int[101];
        int[] before = new int[101];
        for (int i : heights) {
            same[i]++;
        }
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            before[i] = sum;
            sum = before[i] + same[i];
        }
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (i >= before[heights[i]] + same[heights[i]] || i < before[heights[i]]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode1051().heightChecker(new int[]{1,1,4,2,1,3}));
    }
}
