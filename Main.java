import java.util.Scanner;

public class Main {

    private static final String GET_LIST = "1. List";
    private static final String GET_SET = "2. Set";
    private static final String GET_DEQUE = "3. Deque";
    private static final String GET_MAP = "4. Map";

    public static Scanner in = new Scanner(System.in);

    private static void listCollection() {
        System.out.println(GET_LIST);
        System.out.println(GET_SET);
        System.out.println(GET_DEQUE);
        System.out.println(GET_MAP);
    }


    public static void doingCollections() {
        while (true) {
            switch (in.nextInt()) {
                case 1:
                    ListUiHandler listUiHandler = new ListUiHandler();
                    listUiHandler.call();
                    break;
                case 2:
                    SetUiHandler setUiHandler = new SetUiHandler();
                    setUiHandler.call();
                    break;
//                case "3":
//
//                    break;
//                case "4":
//
//                    break;
                default:
                    return;
            }
        }
    }

    public static void choiceCollection() {
        listCollection();

        doingCollections();
    }


    public static void main(String[] args) {
        choiceCollection();
    }
}
