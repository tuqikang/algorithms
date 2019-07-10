package leetcode;

import java.util.Stack;

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
 * @date ：Created in 2019-07-10 21:40
 * @description：删除最外层的括号
 * @modified By：
 * @version:
 */
public class LeetCode1021 {

    /**
     * 用了68ms  不满意
     *
     * @param S
     * @return
     */
//    public String removeOuterParentheses(String S) {
//        Stack<Character> stack = new Stack<>();
//        char[] chars = S.toCharArray();
//        String result = "";
//        String flag = "";
//        for (int i = 0; i < chars.length; i++) {
//            flag += chars[i];
//            if (chars[i] == '(') {
//                stack.push('(');
//            } else {
//                stack.pop();
//                if (stack.isEmpty()) {
//                    result += flag.substring(1, flag.length() - 1);
//                    flag = "";
//                }
//            }
//        }
//        return result;
//    }

    /**
     * 4ms,如果不用StringBuilder时间110多ms，感觉不应该，因为也就十几次的字符串相加，应该是string的效率快，可能是leetCode的问题吧
     *
     * @param S
     * @return
     */
    public String removeOuterParentheses(String S) {
        int flag = 0;//用于判断是否找到原语
        char[] chars = S.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                if (flag != 0) {
                    sb.append('(');
                }
                flag++;
            } else {
                flag--;
                if (flag != 0) {
                    sb.append(')');
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode1021().removeOuterParentheses("(()())(())"));
    }
}
