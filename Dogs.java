import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Dogs extends HomeAnimals {
    public ArrayList commands = new ArrayList<String>();

    public Dogs() {
        this.name = "Dogs_id_" + (++id);
        this.dateBirthDay = LocalDate.now();
        commands.add("Jump");
        commands.add("Sit");
        commands.add("Voice");
    }

    public void getCommands() {
        for (Object object : commands) {
            System.out.println(object);
        }
    }

    public void setCommands(String command) {
        System.out.println("Введите команду: ");
        commands.add(command);
    }

}
