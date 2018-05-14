import java.util.Scanner;

public class Main {

    private Scanner in = new Scanner(System.in);


    private void showMenu() {
        System.out.println("1. Проголосовать");
        System.out.println("2. Вывести статистику");
        System.out.println("3. Выход");
    }

    private void start() {
        while (true) {
            showMenu();
            switch (in.nextInt()) {
                case 1:
                    break;
                case 2:
                    break;
                default:
                    return;
            }
        }
    }




    public static void main(String args[]) {

        new Main().start();

    }
}
