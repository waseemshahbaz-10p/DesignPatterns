package Patterns.AbstractFactory;


public interface Pizza {
    void prepare();
    void bake();
    void cut();
    void box();
}


class MargheritaPizza implements Pizza {

    public void prepare() {
        System.out.println("Preparing Margherita pizza");
    }


    public void bake() {
        System.out.println("Baking Margherita pizza");
    }


    public void cut() {
        System.out.println("Cutting Margherita pizza");
    }


    public void box() {
        System.out.println("Boxing Margherita pizza");
    }
}


class PepperoniPizza implements Pizza {

    public void prepare() {
        System.out.println("Preparing Pepperoni pizza");
    }


    public void bake() {
        System.out.println("Baking Pepperoni pizza");
    }


    public void cut() {
        System.out.println("Cutting Pepperoni pizza");
    }


    public void box() {
        System.out.println("Boxing Pepperoni pizza");
    }
}


class VeggiePizza implements Pizza {

    public void prepare() {
        System.out.println("Preparing Veggie pizza");
    }


    public void bake() {
        System.out.println("Baking Veggie pizza");
    }


    public void cut() {
        System.out.println("Cutting Veggie pizza");
    }


    public void box() {
        System.out.println("Boxing Veggie pizza");
    }
}


interface PizzaFactory {
    Pizza createPizza();
}


class MargheritaPizzaFactory implements PizzaFactory {

    public Pizza createPizza() {
        return new MargheritaPizza();
    }
}


class PepperoniPizzaFactory implements PizzaFactory {

    public Pizza createPizza() {
        return new PepperoniPizza();
    }
}


class VeggiePizzaFactory implements PizzaFactory {

    public Pizza createPizza() {
        return new VeggiePizza();
    }
}


class Main {
    public static void main(String[] args) {

        PizzaFactory margheritaFactory = new MargheritaPizzaFactory();
        Pizza margheritaPizza = margheritaFactory.createPizza();
        margheritaPizza.prepare();
        margheritaPizza.bake();
        margheritaPizza.cut();
        margheritaPizza.box();


        PizzaFactory pepperoniFactory = new PepperoniPizzaFactory();
        Pizza pepperoniPizza = pepperoniFactory.createPizza();
        pepperoniPizza.prepare();
        pepperoniPizza.bake();
        pepperoniPizza.cut();
        pepperoniPizza.box();


        PizzaFactory veggieFactory = new VeggiePizzaFactory();
        Pizza veggiePizza = veggieFactory.createPizza();
        veggiePizza.prepare();
        veggiePizza.bake();
        veggiePizza.cut();
        veggiePizza.box();
    }
}
