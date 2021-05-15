package restaurant;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Restaurant {
    public static void main(String[] args) {
        MenuItems item1 = new MenuItems(4.99, "Jarod", "Dinner", true);
        MenuItems item2 = new MenuItems(6.50, "Dennis", "Desert",false );
        MenuItems item3 = new MenuItems(8.99, "Ben", "rolls", true);
        MenuItems item4 = new MenuItems(9.99, "Musaddiq", "no", true);
        MenuItems item5= new MenuItems(9.99, "Musaddiq", "no", true);
        Date today = Calendar.getInstance().getTime();

        ArrayList<MenuItems> startingMenu = new ArrayList<>();

        Menu ourMenu = new Menu(today, startingMenu);
        ourMenu.addItems(item1);
        ourMenu.addItems(item2);
        ourMenu.addItems(item3);
        ourMenu.addItems(item4);
        ourMenu.addItems(item5);

        ourMenu.printMenu();

        ourMenu.removeItems(item4);

        ourMenu.printMenu();

        System.out.println(ourMenu.menuUpdated());

        ourMenu.printMenu();

    }

}
