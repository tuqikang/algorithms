package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * @date ：Created in 2019-07-14 22:12
 * @description：
 * @modified By：
 * @version:
 */
public class LeetCode1078 {

    public String[] findOcurrences(String text, String first, String second) {
        StringBuilder sb = new StringBuilder();
        String[] strs = text.split(" ");
        for (int i = 1; i < strs.length - 1; i++) {
            if (strs[i - 1].equals(first) && strs[i].equals(second)) {
                sb.append(strs[i + 1]).append("-");
            }
        }
        String[] result = sb.toString().split("-");
        if (result[0].equals("")) {
            result = new String[0];
        }
        return result;
    }
}
