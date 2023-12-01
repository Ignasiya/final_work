package core.data;

import java.util.List;

public abstract class Pet extends Animal{
    public Pet(int id, String name, String birthday, List<String> commands) {
        super(id, name, birthday, commands);
    }
}
