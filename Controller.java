
public class Controller {

    public static int StartProgram() {
        int menu = View.ShowMenu();
        return menu;
    }

    public static int SelectMenu(int menu) {

        switch (menu) {
            case 1:
                System.out.println("Enter 1");
                System.out.print("\nВыберите класс животного, которое хотите добавить: ");
                byte start = 1;
                byte end = 3;
                // Проверяем на валидность введные данные
                int class_animals = ValidationInput(View.SelectedClassAnimal(), start, end);
                switch (class_animals) {
                    case 1:
                        System.out.println("class Home Animals");
                        // que.add(new Robot());
                        // SelectMenu(View.ShowMenu());
                        return 1;
                    case 2:
                        System.out.println("class Pack Animals");
                        // que.add(new Constructor());
                        // SelectMenu(View.ShowMenu());
                        return 2;
                }
                SelectMenu(View.ShowMenu());
                return 1;

            case 2:
                System.out.println("Enter 2");
                return 2;
            case 3:
                System.out.println("Enter 3");
                return 2;
            case 4:
                System.out.println("Enter 4");
                return 2;
            case 5:
                System.out.println("Enter 5");
                return 2;
            case 6:
                System.out.println("Enter 6");
                return 2;
            case 7:
                System.out.println("Enter 7");
                break;
        }
        return menu;
    }

    // **Функиция принимает строку и диапазон [start :end] и проверяет, что введно
    // число из этого диапазона */
    public static int ValidationInput(String input, int start, int end) {
        int userInt;

        try {
            userInt = Integer.parseInt(input);
            if (userInt != (int) userInt || userInt < start || userInt > end)
                throw new Exception();
        } catch (Exception e) {
            System.out.println(
                    "\nВводить можно только цифры из диапазона меню!" + " от " + start + " до " + end
                            + "\nПовторите ввод!\n");
            userInt = -1;

        }
        return userInt;
    }

}