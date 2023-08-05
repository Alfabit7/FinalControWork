import java.time.LocalDate;

public class HomeAnimals extends Animals {
    static int num = 0;
    public String name;
    LocalDate dateBirthDay;
    String [] commands = ["Jump", "Sit", "Voice"];

    public HomeAnimals() {
        this.num += num;
        this.name = "Robot_id_" + (num);
        this.dateBirthDay = LocalDate.now();
    }

    // Задать новую команду
    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    // Посмотреть список комманд
    public String[] getCommands() {
        return commands;
    }
}
