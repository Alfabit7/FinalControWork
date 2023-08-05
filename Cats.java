import java.time.LocalDate;
import java.util.ArrayList;

public class Cats extends HomeAnimals {
    public ArrayList commands = new ArrayList<String>();

    public Cats() {
        this.name = "Cat_id_" + (++id);
        this.dateBirthDay = LocalDate.now();
        // { "Jump", "Sit", "Voice" };
        commands.add("фу");
        commands.add("сидеть");
        commands.add("Бежать");
    }

    public void getCommands() {
        for (Object object : commands) {
            System.out.println(object);
        }
    }

}
