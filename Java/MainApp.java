import java.io.IOException;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileImport fileImport = new FileImport();
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
                    interactionWithTheUser.case1(text1, key1);
                    break;
                case 2:
                    System.out.print("Введите слово на Английском: ");
                    String text2 = scanner.nextLine();
                    System.out.print("Введите ключ: ");
                    int key2 = scanner.nextInt();
                    interactionWithTheUser.case2(text2, key2);
                    break;
                case 3:
                    System.out.print("Введите слово на русском: ");
                    String text3 = scanner.nextLine();
                    System.out.print("Введите ключ: ");
                    int key3 = scanner.nextInt();
                    interactionWithTheUser.case3(text3, key3);
                    break;
                case 4:
                    System.out.print("Введите слово на Английском: ");
                    String text4 = scanner.nextLine();
                    System.out.print("Введите ключ: ");
                    int key4 = scanner.nextInt();
                    interactionWithTheUser.case4(text4, key4);
                    break;
                case 5:
                    System.out.print("Обозначьте путь к вашему файлу: ");
                    String txt = fileImport.readFile(scanner.nextLine());
                    System.out.print("Введите ключ: ");
                    int key5 = scanner.nextInt();
                    interactionWithTheUser.case5(txt, key5);
                    break;
                case 6:
                    System.out.print("Обозначьте путь к вашему файлу: ");
                    String txt1 = fileImport.readFile(scanner.nextLine());
                    System.out.print("Введите ключ: ");
                    int key6 = scanner.nextInt();
                    interactionWithTheUser.case6(txt1, key6);
                    break;
                case 7:
                    System.out.print("Обозначьте путь к вашему файлу: ");
                    String txt2 = scanner.nextLine();
                    System.out.print("Напишите текст который нужно сохранить: ");
                    String teext = scanner.nextLine();
                    try {
                        fileImport.saveFile(txt2, teext);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                default:
                    System.out.println("Такой функции нету");
            }
        }
    }
}
