public class main {
    public static void main(String []args){

        // now we make our composite menus
        MenuComponent pancakeHouseMenu=new Menu("Pancake house menu","Breakfast");
        MenuComponent dinerMenu=new Menu("Diner menu","Lunch");
        MenuComponent cafeMenu=new Menu("Cafe menu","Dinner");
        //now we make a composite menu we add all menus above in it
        MenuComponent allMenus=new Menu("All menus","All combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
        //now lets make the menu items (the leafs)
        pancakeHouseMenu.add(new MenuItem("cheese cake",false,3.99));
        pancakeHouseMenu.add(new MenuItem("hello world cake",false,5.99));
        cafeMenu.add(new MenuItem("Late",false,4.99) );
        cafeMenu.add(new MenuItem("Tea",true,0.99) );
        Watieress watieress=new Watieress(allMenus);
        watieress.printMenu();
    }
}
