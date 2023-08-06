import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Controller {
    static ArrayList arrAnimals = new ArrayList<Animals>();

    public static int StartProgram() {
        int menu = View.ShowMenu();
        return menu;
    }

    public static int SelectMenu(int menu) {

        switch (menu) {
            case 1:
                System.out.println("Enter 1");
                System.out.print("\nВыберите  животное, которое хотите добавить: ");
                byte start = 1;
                byte end = 4;
                // Проверяем на валидность введные данные
                int class_animals = ValidationInput(View.SelectedClassAnimal(), start, end);
                switch (class_animals) {
                    case 1:
                        System.out.println("class Cats Animals");
                        arrAnimals.add(new Cats());
                        Animals.add();
                        SelectMenu(View.ShowMenu());
                        return 1;
                    case 2:
                        System.out.println("class Pack Animals");
                        arrAnimals.add(new Dogs());
                        Animals.add(); // счетчик всех животных из класса Animal
                        SelectMenu(View.ShowMenu());
                        return 2;
                    case 3:
                        System.out.println("class Dogs Animals");

                        arrAnimals.add(new Dogs());
                        Animals.add();
                        SelectMenu(View.ShowMenu());
                        return 3;
                }
                SelectMenu(View.ShowMenu());
                return 1;

            case 2:
                System.out.println("Enter 2");

                SelectMenu(View.ShowMenu());
                return 2;
            case 3:
                System.out.println("Enter 3");

                // Проверка что массив не пустой
                if (arrAnimals.size() == 0) {
                    System.out.println(" с животными пуст добавьте животное");
                    SelectMenu(View.ShowMenu());
                }

                System.out.println("Выбирите животное, команды которого Вы хотите посмотреть: ");
                System.out.println();

                byte countTypeAnimal = 6;
                start = 1;
                end = (byte) countTypeAnimal; // количество видов животных собак кошек ослов итд.

                // проверка на валидность данных
                int numberAnimalType = ValidationInput(View.SelectedClassAnimal(), start, end);

                // Если введено значение больше 0 и меньше countTypeAnimal то выводим команду
                // животного
                if (numberAnimalType > 0 && numberAnimalType < arrAnimals.size()) {
                    Animals selectedAnimal = (Animals) arrAnimals.get(numberAnimalType);
                    selectedAnimal.getCommands();
                } else if (numberAnimalType < 0 && numberAnimalType > arrAnimals.size()) {
                    System.out.println("Животное с таким номером не существует. Выбирите правильный номер из списка");
                }
                SelectMenu(View.ShowMenu());

                return 3;
            case 4:
                System.out.println("Enter 4");
                System.out.println("Обучить команде");
                Object elAnimal = arrAnimals.get(0);
                ((Animals) elAnimal).setCommands();
                // countTypeAnimal = 6;
                // start = 1;
                // end = (byte) countTypeAnimal; // количество видов животных собак кошек ослов
                // итд.
                // проверка на валидность данных
                // numberAnimalType = ValidationInput(userInput, start, end);

                // Scanner sc = new Scanner(System.in);
                // String userInput = sc.nextLine();
                // System.out.println(arrAnimals.size());
                // System.out.println(userInput);

                // =====
                // Если введено значение больше 0 и меньше countTypeAnimal то выводим команду
                // животного
                // if (numberAnimalType >= 0 && numberAnimalType < arrAnimals.size()) {
                // Animals selectedAnimal = (Animals) arrAnimals.get(numberAnimalType);
                // selectedAnimal.setCommands();
                // } else if (numberAnimalType < 0 && numberAnimalType > arrAnimals.size()) {
                // System.out.
                // println("Животное с таким номером не существует. Выбирите правильный номер из
                // списка"
                // );
                // }

                SelectMenu(View.ShowMenu());

                return 4;
            case 5:
                System.out.println("Enter 5");
                for (Object object : arrAnimals) {
                    System.out.println(object);
                }
                SelectMenu(View.ShowMenu());
                return 5;
            case 6:
                System.out.println("Enter 6");
                return 6;
            case 7:
                System.out.println("Exit the program");
                break;
        }
        return menu;
    }

    // **Функция принимает строку и диапазон [start :end] и проверяет, что введно
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
            SelectMenu(View.ShowMenu());
        }

        return userInt;
    }

}