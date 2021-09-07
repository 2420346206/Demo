import java.util.Scanner;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Login {
    private static String userID;
    private static String password;
    private static String userName;
    private static String petName;
    private static Calendar date;
    private static String signature;
    static int menu(Scanner scanner) {
        int choice = -1;
        System.out.printf("\n");
        System.out.printf("\t\t\t  音乐播放管理软件		    \n");
        System.out.printf("\t\t\t  =======================	\n");
        System.out.printf("\t\t\t  1.登录			        \n");
        System.out.printf("\t\t\t  2.注册         		    \n");
        System.out.printf("\t\t\t  0.关闭播放器			    \n");
        System.out.printf("\t\t\t  =======================  \n");
        System.out.printf("\t\t\t  请输入您的选择：		    \n");
        choice = scanner.nextInt();
        return choice;
    }
    public static void compare() {
        int menuChoice = -1;
        Scanner scanner = new Scanner(System.in);
        do {
            menuChoice = menu(scanner);
            switch (menuChoice){
                case 1:
                    System.out.println("请输入账号：");
                    Scanner input = new Scanner(System.in);
                    userID = input.next();
                    System.out.println("请输入密码：");
                    password = input.next();
                    User user = Dao.checkUser(userID, password);
                    if (user.getUserName() != null)
                        System.out.println("登录成功");
                    else
                        System.out.println("账号或密码错误");
                    break;
            }
        } while (menuChoice != 0);
        scanner.close();
    }
}
