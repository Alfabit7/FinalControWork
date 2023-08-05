import java.util.Scanner;

public class View {

    /**
     * @return
     */
    public static int ShowMenu() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println(
                    "\n1- Завести новое животное \n2- Определить животное в класс \n3- Посмотреть список командб которое выполняет животное  \n4- Обучить животное новым командам \n5- Показать все игрушки \n6- Сохранить в файл\n7 -Выход из программы\n");

            System.out.print("Выберите пункт меню: ");
            String userInput = sc.nextLine();
            int userInt;
            try {
                userInt = Integer.parseInt(userInput);
                if (userInt < 1 || userInt > 7 || userInt != (int) userInt)
                    throw new Exception();
                switch (userInt) {
                    case 1:
                        return 1;
                    case 2:
                        return 2;
                    case 3:
                        return 3;
                    case 4:
                        return 4;
                    case 5:
                        return 5;
                    case 6:
                        return 6;
                    case 7:
                        return 7;
                }
            } catch (Exception e) {
                System.out.println(
                        "\nВводить можно только цифры из диапазона меню! от  1 7 \nПовторите ввод!\n");
            }

        }
    }
}