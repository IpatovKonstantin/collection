import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListUiHandler {
    private static final String ISEMPTY_LIST = "1. проверка на полноту коллекции";
    private static final String GET_ELEMENT = "2. содержит ли коллекция введеный элемент";
    private static final String ADD_ELEMENT = "3. Добавить элемент в конец списка";
    private static final String ADD_BY_INDEX = "4. добавить элемент на определенную позицию";
    private static final String REMOVE_ELEMENT = "5. Удалить элемент";
    private static final String REMOVE_BY_INDEX = "6. удалить элемент из определеннной позиции";
    private static final String SHOW_ITEMS = "7. Вывести список";
    private static final String GO_TO_MAIN_MENU = "8. возврат в меню выбора коллекции";

    private final Scanner in = new Scanner(System.in);
    private final List list = new ArrayList();

    public void call() {
        while (true) {
            showMenu();
            switch (in.nextInt()) {
                case 1:
                    System.out.println("List.isEmpty() == " + list.isEmpty());
                    break;

                case 2: {
                    System.out.println("Введите элемент");
                    String item = in.next();
                    System.out.println(String.format("List.contains(%s) == %b", item, list.contains(item)));
                }
                break;

                case 3: {
                    System.out.println("Введите объект");
                    String item = in.next();
                    System.out.println(String.format("List.add(%s) == %b", item, list.add(item)));
                }
                break;

                case 4: {
                    System.out.println("Введите номер и объект");
                    list.add(in.nextInt(), in.next());
                }
                break;

                case 5: {
                    System.out.println("Введите объект");
                    list.remove(in.next());
                }
                break;

                case 6: {
                    System.out.println("Введите номер ");
                    list.remove(in.nextInt());
                }
                break;

                case 7:
                    System.out.println("лист" + list);
                    break;

                default:
                    return;
            }
        }
    }

    private void showMenu() {
        System.out.println(ISEMPTY_LIST);
        System.out.println(GET_ELEMENT);
        System.out.println(ADD_ELEMENT);
        System.out.println(ADD_BY_INDEX);
        System.out.println(REMOVE_ELEMENT);
        System.out.println(REMOVE_BY_INDEX);
        System.out.println(SHOW_ITEMS);
        System.out.println(GO_TO_MAIN_MENU);
    }


}
