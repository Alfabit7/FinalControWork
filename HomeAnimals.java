import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class HomeAnimals extends Animals implements getCommands, setCommands {
    public String name;
    LocalDate dateBirthDay;
    private List<String> commands;
    String type_id = "HomeAnimals";

    public HomeAnimals(String animalClass, int id, String name, LocalDate dateBirthDay) {
        super(animalClass);
        this.name = name;
        this.dateBirthDay = dateBirthDay;
        this.commands = new ArrayList<>();
        this.id_animals = id_animals;
    }

    // Посмотреть список комманд
    public void getCommands() {
        for (Object object : commands) {
            System.out.println(object);
        }
    }

    // Задать новую команду
    public void setCommands(String command) {
        System.out.println("Введите команду: ");
        commands.add(command);
    }

    // public void setCommands() {
    // System.out.println("Введите команду: ");
    // try (Scanner sc = new Scanner(System.in)) {
    // String userInput;
    // userInput = sc.nextLine();
    // commands.add(userInput);
    // } catch (Exception e) {
    // System.out.println("ERORR");
    // e.getMessage();
    // }
    // }

    @Override
    public String toString() {
        String info = "name: " + this.name + " dateBirthDay: " + this.dateBirthDay;
        return info;
    }

}
