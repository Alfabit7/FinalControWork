import java.time.LocalDate;
import java.util.LinkedList;

public abstract class PackAnimals extends Animals implements getCommands {
    static int id = 0;
    public String name;
    LocalDate dateBirthDay;
    String type_id = "PackAnimals";
    LinkedList<String> commands = new LinkedList<String>();

    public PackAnimals() {
        this.name = "Pack_Animals_" + (++id);
        this.dateBirthDay = LocalDate.now();
    }

    // Задать новую команду
    public void setCommands(String str) {
        commands.addLast(str);
    }

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
