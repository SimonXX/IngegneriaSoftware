package designPatterns.Command;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private final List<MenuItem> menuItems;
    private final String name;

    public Menu(String name) {
        this.name = name;
        menuItems = new ArrayList<>();
    }

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public void show() {
        System.out.println("Menu " + name);
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + ". " + menuItems.get(i).getName());
        }

        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();
        if (selection >= 0 && selection < menuItems.size()) {
            menuItems.get(selection).execute();
        }
    }
}
