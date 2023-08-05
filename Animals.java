import java.util.Random;
import java.util.UUID;

public abstract class Animals {
    static int num = 0;
    protected String id_animals;
    protected String class_animals;

    public Animals() {
        // генерирует ID
        this.id_animals = UUID.randomUUID().toString();
        this.class_animals = class_animals;
    }

    protected int add(int num) {
        try {
            num += num;
        } catch (Exception e) {
            // TODO: handle exception
            e.getMessage();
        }
        return num;
    }

}
