// Miras Abdulvakhap(250103077) 04-N date: 20.10.2026


interface Pizza{
    double getCost();
    String getDescription();
}
class PlainPizza implements Pizza{
    public double getCost() {
        return 5;
    }
    public String getDescription(){
        return "Plain Dough & Sauce";
    }
}
class Cheese implements Pizza{
    private final Pizza pizza;
    Cheese(Pizza pizza) {
        this.pizza = pizza;
    }
    public double getCost(){
        return pizza.getCost() + 2;
    }
    public String getDescription(){
        return pizza.getDescription() + "+cheese";
    }
}
class Olives implements Pizza{
    private final Pizza pizza;
    Olives(Pizza pizza) {
        this.pizza = pizza;
    }
    public double getCost(){
        return pizza.getCost() + 1;
    }
    public String getDescription() {
        return pizza.getDescription() + "+olives";
    }
}
class Pineapple implements Pizza{
    private final Pizza pizza;
    Pineapple(Pizza pizza){
        this.pizza = pizza;
    }
    public double getCost(){
        return pizza.getCost() + 1.5;
    }
    public String getDescription() {
        return pizza.getDescription() + "+pineapple";
    }
}
public class exercise3 {
    public static void main(String[] args) {
        Pizza pizza = new Pineapple(new Olives(new Cheese(new PlainPizza())));
        System.out.println("Pizza: " + pizza.getDescription());
        System.out.println("Total Cost:$" + pizza.getCost());
    }
}


