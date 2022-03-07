
import java.util.Scanner;

/**
 * Create with IntelliJ IDAE
 *
 * @Author: JINLEI
 * @Description:
 * @Date: 2022/3/7
 * @Time: 19:53
 **/
public class Text {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String hex = sc.nextLine();
//            System.out.println(Long.parseLong(hex,16));
            System.out.println(Integer.parseInt(hex,16));
        }

    }

}
