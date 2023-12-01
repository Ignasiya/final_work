package core.data;

import java.util.List;

public abstract class Animal {
    protected int id;
    protected String name;
    protected String birthday;
    protected List<String> commands;

    public Animal(int id, String name, String birthday, List<String> commands) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.commands = commands;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public String getBirthday() {
        return birthday;
    }

    public List<String> getCommands() {
        return commands;
    }

    @Override
    public String toString() {
        return String.format("%d. " +
                "имя: %s, " +
                "%s, " +
                "дата рождения: %s, " +
                "комманды: %s", id, name, getClass().getSimpleName(), birthday, commands.toString());
    }
}


