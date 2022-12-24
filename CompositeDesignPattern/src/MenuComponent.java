public abstract class MenuComponent {
    public void add(MenuComponent menuComponent){
        //in case of the methods that may differ from menuItem and the Composite Menu
        //we make a deafault implementation that throws a runtime exception
        //which is UnsupportedOperationException();
        //so we don't have to override that method in the class that doesn't want to use this method
        //as it just inherits the default implementation from the base class
        throw new UnsupportedOperationException();
    }
    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }
    public String getName(){
        throw new UnsupportedOperationException();
    }
    public String getDescriptionn(){
        throw new UnsupportedOperationException();
    }
    public double getPrice(){
        throw new  UnsupportedOperationException();
    }
    public boolean isVegeterian(){
        throw new UnsupportedOperationException();
    }
    public void print(){
        throw new UnsupportedOperationException();
    }
}
