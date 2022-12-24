import java.util.ArrayList;

import java.util.List;
public class Menu extends MenuComponent{
    List<MenuComponent> menuComponents=new ArrayList<>();
    String name,description;
    public Menu(String name,String description){
        this.name=name;
        this.description=description;
    }
    //now we override the methods we need from the abstract class
    public void add(MenuComponent menuComponent){
        menuComponent.add(menuComponent);
    }
    public void remove(MenuComponent menuComponent){
        menuComponent.remove(menuComponent);
    }
    public MenuComponent getChild(int i){
        return menuComponents.get(i);
    }
    public String getName(){
        return name;
    }
    public String getDescriptionn(){
        return description;
    }

    public void print(){
        System.out.print("\n"+getName());
        System.out.println(", "+getDescriptionn());
        System.out.println("---------------------------------------");
        for(MenuComponent menu:menuComponents){
            menu.print();
        }
    }
}
