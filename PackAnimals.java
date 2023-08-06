import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class PackAnimals extends Animals {
    private String name;
    LocalDate dateBirthDay;
    String type_id = "PackAnimals";
    private List<String> commands;

    public PackAnimals(String animalClass) {
        super(animalClass);
        this.name = name;
        this.dateBirthDay = LocalDate.now();
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

    @Override
    public String toString() {
        String info = "name: " + this.name + " dateBirthDay: " + this.dateBirthDay;
        return info;
    }

}
