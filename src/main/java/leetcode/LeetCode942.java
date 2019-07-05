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
 * @date ：Created in 2019-07-05 13:32
 * @description： 增减字符串匹配
 * @modified By：
 * @version: 0.0.1
 */
public class LeetCode942 {

    public int[] diStringMatch(String S) {
        int len = S.length();
        int[] result = new int[len + 1];
        int slow = 0;
        int hight = len;
        for (int i = 0; i < len; i++) {
            if (S.charAt(i) == 'I') {
                result[i] = slow++;
            } else {
                result[i] = hight--;
            }
        }
        result[len] = hight;
        return result;
    }

    public static void main(String[] args) {
        int[] arr = new LeetCode942().diStringMatch("III");
        for (int i : arr){
            System.out.print(i+"\t");
        }
    }
}
