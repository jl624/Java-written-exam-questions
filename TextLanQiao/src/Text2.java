import java.util.Scanner;

/**
 * Create with IntelliJ IDAE
 *
 * @Author: JINLEI
 * @Description:
 * @Date: 2022/3/7
 * @Time: 20:20
 **/
public class Text2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(Integer.toHexString(n).toUpperCase());
    }
}
