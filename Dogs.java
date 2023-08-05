import java.time.LocalDate;
import java.util.ArrayList;

public class Dogs extends HomeAnimals {
    public ArrayList commands = new ArrayList<String>();

    public Dogs() {
        this.name = "Dogs_id_" + (++id);
        this.dateBirthDay = LocalDate.now();
        // { "Jump", "Sit", "Voice" };
        commands.add("Jump");
        commands.add("Sit");
        commands.add("Voice");
    }

    public void getCommands() {
        for (Object object : commands) {
            System.out.println(object);
        }
    }

}
