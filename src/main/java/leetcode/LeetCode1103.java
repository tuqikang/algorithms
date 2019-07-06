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
 * @date ：Created in 2019-07-06 20:56
 * @description：分糖果II
 * @modified By：
 * @version:
 */
public class LeetCode1103 {

    public int[] distributeCandies(int candies, int num_people) {
        int[] result = new int[num_people];
        int base = 0;
        int n;
        while (true){
            n = base*num_people+1;
            for (int i = 0;i<num_people;i++,n++){
                if (n<candies){
                    result[i]+=n;
                    candies-=n;
                }else {
                    result[i]+=candies;
                    return result;
                }
            }
            base++;
        }
    }

    public static void main(String[] args) {
        int[] ints = new LeetCode1103().distributeCandies(10, 3);
        for (int i: ints){
            System.out.print(i+"\t");
        }
    }

}
