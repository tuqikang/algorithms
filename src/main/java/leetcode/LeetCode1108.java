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
 * @date ：Created in 2019-07-08 19:26
 * @description：IP_地址无效化,
 *  给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。
 *  所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."。
 * @modified By：
 * @version:
 */
public class LeetCode1108 {

    public String defangIPaddr(String address) {
        String[] s = address.split("\\.");
        String a = "[.]";
        String result = "";
        int len = s.length - 1;
        for (int i = 0; i < len; i++) {
            result = result + s[i] + a;
        }
        result += s[len];
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode1108().defangIPaddr("255.100.50.0"));
    }
}
