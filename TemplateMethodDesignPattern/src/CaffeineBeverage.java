public abstract class CaffeineBeverage {
    public CaffeineBeverage(){
        //in template method we define a function which has fixed algorithm
        //but there are some steps that we make it abstract and implement it in subclasses
    }
    // final to make the function un able to be overridden
    final void PrepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantCondiments()) {
            addCondiments();
        }
    }
    abstract void brew();
    abstract void addCondiments();
    void boilWater(){
        System.out.println("Boiling Water");
    }
    void pourInCup(){
        System.out.println("Pouring In Cup");
    }
    boolean customerWantCondiments(){
        return true;                   //this is a hook because the subclass can override it,but it doesn't have to
    }
}
