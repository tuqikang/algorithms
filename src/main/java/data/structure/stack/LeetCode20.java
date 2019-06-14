package data.structure.stack;

import java.util.HashMap;
import java.util.Map;
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
 * @date ：Created in 2019-06-14 08:52
 * @description：有效括号匹配
 * @modified By：
 * @version:
 */
public class LeetCode20 {

    private Stack<Character> stack = new Stack<>();

    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        char[] cs = s.toCharArray();
        char flag;
        for (char c : cs) {
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else {
                if (stack.empty()) {
                    return false;
                }
                flag = stack.pop();
                if (flag != get(c)) {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    public static char get(char c){
        if (c==')') {
            return '(';
        }
        if (c==']') {
            return '[';
        }else {
            return '{';
        }
    }

    public static void main(String[] args) {
        if (new LeetCode20().isValid("{[]}") == true) {
            System.out.println("true");
        } else {
            System.out.println(false);
        }
    }
}
