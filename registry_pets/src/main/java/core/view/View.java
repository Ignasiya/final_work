package core.view;

import core.control.BasicControl;
import core.control.Control;
import core.model.*;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class View implements BasicView {
    private final BasicControl control;


    public View() {
        Mode add = new Add();
        Mode exit = new Exit();
        Map<String, Mode> menu = new LinkedHashMap<>();
        menu.put(add.getNameMenu(), add);
        menu.put(exit.getNameMenu(), exit);
        this.control = new Control(menu);
        start(control, "\nПриветствуем в Магазине игрушек");
    }

    @Override
    public BasicControl getControl() {
        return control;
    }

    @Override
    public void start(BasicControl control, String text) {
        Scanner in = new Scanner(System.in).useDelimiter("\r?\n");
        System.out.println(text);
        System.out.print(control.toString() + "\n");
        while (true) {
            System.out.print(" ->");
            String input = in.next().strip().trim().toLowerCase();
            control.onExecute(input, in);
        }
    }
}
