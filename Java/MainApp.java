import java.util.Scanner;
public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InteractionWithTheUser interactionWithTheUser = new InteractionWithTheUser();


        while (true) {
            interactionWithTheUser.operationBlock();
            byte operation = scanner.nextByte();
            scanner.nextLine();
            switch (operation) {
                case 1:
                    System.out.print("Введите слово на русском: ");
                    String text1 = scanner.nextLine();
                    System.out.print("Введите ключ: ");
                    int key1 = scanner.nextInt();
                    interactionWithTheUser.case1(text1,key1);
                    break;
                case 2:
                    System.out.print("Введите слово на Английском: ");
                    String text2 = scanner.nextLine();
                    System.out.print("Введите ключ: ");
                    int key2 = scanner.nextInt();
                    interactionWithTheUser.case2(text2,key2);
                    break;
                case 3:
                    System.out.print("Введите слово на русском: ");
                    String text3 = scanner.nextLine();
                    System.out.print("Введите ключ: ");
                    int key3 = scanner.nextInt();
                    interactionWithTheUser.case3(text3,key3);
                    break;
                case 4:
                    System.out.print("Введите слово на Английском: ");
                    String text4 = scanner.nextLine();
                    System.out.print("Введите ключ: ");
                    int key4 = scanner.nextInt();
                    interactionWithTheUser.case4(text4,key4);
                    break;
                default:
                    System.out.println("Такой функции нету");
            }
        }
    }
}
