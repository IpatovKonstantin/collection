import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class VotingUiHandler {
    private Scanner in = new Scanner(System.in);

    public void start(){
        showMenu();
        List list1 = new ArrayList();
        List list2 = new ArrayList();
        List list3 = new ArrayList();

        while(true){
            int action = in.nextInt();
            switch (action){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    return;
            }
        }
    }

    private void showMenu(){
        System.out.println("1. Кандидат №1");
        System.out.println("2. Кандидат №2");
        System.out.println("3. Кандидат №3");
    }
}
