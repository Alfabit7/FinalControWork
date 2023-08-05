import java.util.Random;
import java.util.UUID;

public abstract class Animals {

    protected String id_Animals;
    protected String class_animals;

    public Animals() {
        // генерирует ID
        this.id_Animals = UUID.randomUUID().toString();
        this.class_animals = class_animals;
    }

}
