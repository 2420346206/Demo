import java.util.Scanner;

public class Main {
    static int menu(Scanner scanner) {
        int choice = -1;
        System.out.printf("\n");
        System.out.printf("\t\t\t  音乐播放管理软件		    \n");
        System.out.printf("\t\t\t  =======================	\n");
        System.out.printf("\t\t\t  1.歌曲查找			    \n");
        System.out.printf("\t\t\t  2.用户歌单收藏管理			\n");
        System.out.printf("\t\t\t  3.导出歌单到txt文件			\n");
        System.out.printf("\t\t\t  4.用txt导入歌单		    \n");
        System.out.printf("\t\t\t  5.音乐播放		        \n");
        System.out.printf("\t\t\t  6.用户信息修改             \n");
        System.out.printf("\t\t\t  7.退出登录                \n");
        System.out.printf("\t\t\t  0.关闭播放器			    \n");
        System.out.printf("\t\t\t  =======================  \n");
        System.out.printf("\t\t\t  请输入您的选择：		    \n");
        choice = scanner.nextInt();
        return choice;
    }
    public static void main(String[] args) {
        int menuChoice = -1;
        Login.compare();
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        do {
            menuChoice = menu(scanner);
            switch (menuChoice){
                case 1:
            }
        } while (menuChoice != 0);
        scanner.close();
    }
}
