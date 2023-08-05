import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;

public abstract class HomeAnimals extends Animals implements getCommands {
    static int id = 0;
    public String name;
    LocalDate dateBirthDay;
    LinkedList<String> commands = new LinkedList<String>();
    String type_id = "HomeAnimals";

    public HomeAnimals() {
    }

    // Задать новую команду
    public void setCommands(String str) {
    }

    // Посмотреть список комманд
    // public void getCommands() {
    // }

    public void getCommands() {
        for (String com : commands) {
            System.out.println(com);
        }
    }

    @Override
    public String toString() {
        String info = "name: " + this.name + " dateBirthDay: " + this.dateBirthDay;
        return info;
    }

}
