package core.model;

import java.util.Scanner;

public class Add extends Mode {

    public Add() {
        super("add", "добавить");
    }

    @Override
    public void execute(Scanner scanner) {

        System.out.println("-> добавлено успешно");
    }
}
