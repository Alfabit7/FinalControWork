import java.lang.reflect.Constructor;
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
                        System.out.print("\nВыберите класс животного, которое хотите добавить: ");
                        byte start = 1;
                        byte end = 2;
                        int typeToys = ValidationInput(View.SelectedClassAnimal(), start, end);
                        switch (typeToys) {
                            case 1:
                                // que.add(new Robot());
                                // SelectMenu(View.ShowMenu());
                                return 1;
                            case 2:
                                // que.add(new Constructor());
                                // SelectMenu(View.ShowMenu());
                                return 2;
                        }
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

    public static String SelectedClassAnimal() {
        Scanner sc = new Scanner(System.in);
        String userInput;
        System.out.println("\n1- Home Animals \n2- Pack Animals");
        System.out.print("Выберите пункт меню: ");
        userInput = sc.nextLine();
        return userInput;
    }

    // **Функиция принимает строку и диапазон [start :end] и проверяет, что введно
    // число из этого диапазона */
    public static int ValidationInput(String input, int start, int end) {
        int userInt = -1;

        try {
            userInt = Integer.parseInt(input);
            if (userInt != (int) userInt || userInt > start || userInt < end)
                throw new Exception();
        } catch (Exception e) {
            System.out.println(
                    "\nВводить можно только цифры из диапазона меню!" + " от " + start + " до " + end
                            + "\nПовторите ввод!\n");

        }
        return userInt;
    }

}