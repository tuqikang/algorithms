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
 * @date ：Created in 2019-07-24 15:56
 * @description：
 * @modified By：
 * @version:
 */
public class LeetCode459 {
//    public boolean repeatedSubstringPattern(String s) {
//        int len = s.length();
//        int tail = len / 2 + 1;
//        String flag;
//        for (int i = 1; i < tail; i++) {
//            if (len % i == 0) {
//                flag = new String(s.getBytes(), 0, i);
//                if (s.split(flag).length == 0) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    public boolean repeatedSubstringPattern(String s) {
        return (s+s).substring(0,s.length()*2-1).indexOf(s)!=-1;
    }

    public static void main(String[] args) {
        new LeetCode459().repeatedSubstringPattern("abab");
    }
}
