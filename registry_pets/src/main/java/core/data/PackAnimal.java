package core.data;

import java.util.List;

public abstract class PackAnimal extends Animal{
    public PackAnimal(int id, String name, String birthday, List<String> commands) {
        super(id, name, birthday, commands);
    }
}
