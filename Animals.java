import java.util.Random;
import java.util.UUID;

public abstract class Animals implements getCommands {
    static int num = 0;
    protected String id_animals;
    protected String class_animals;

    public Animals() {
        // генерирует ID
        this.id_animals = UUID.randomUUID().toString();
        this.class_animals = class_animals;
    }

    public static int add() {
        num = ++num;
        return num;
    }

    @Override
    public String toString() {
        String info = "id: " +
                this.id_animals + " class_animals: " +
                this.class_animals;
        return info;
    }

    public void getCommands() {

    }

}
