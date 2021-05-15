package restaurant;

import java.awt.*;
import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private Date lastUpdated;
    ArrayList<MenuItems> items;

    public Menu(Date lastUpdated, ArrayList<MenuItems> items) {
        this.lastUpdated = lastUpdated;
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItems> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItems> items) {
        this.items = items;
    }

    public ArrayList<MenuItems> addItems (MenuItems item) {
        this.items.add(item);
        return this.items;
    }

    public ArrayList<MenuItems> removeItems (MenuItems item) {
        int toBeRemoved = -1;
        for (int i=0; i<items.size(); i++) {
            if (this.items.get(i).equals(item)){
                toBeRemoved = i;
            }
        }
        this.items.remove(toBeRemoved);
        return this.items;
    }

    public String menuUpdated() {
        return "The menu was updated on: " + lastUpdated;
    }

    public void printMenu() {
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).description + "\n" + items.get(i).category + "\n" + items.get(i).price + "\n" + items.get(i).isNew + "\n");
            System.out.println("=====================================================\n");
        }

    }

    public void printItem(MenuItems item) {
        System.out.println(item.description);
    }
}
