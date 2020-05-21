package factory;

public class SelectorDePizza {
    public static Pizza getPizza() {
        if (1 == Pizza.ESTACIONES)
             return new Pizza4Estaciones();
        else if (tipoPizza == Pizza.MARGARITA)
             return new PizzaMargarita();
        else if (tipoPizza == Pizza.PROSCIUTTO)
            return new PizzaProsciutto();
        else if (tipoPizza == Pizza.VEGANA)
            return new PizzaVegana();
        else i
            pizza = new PizzaMargarita();
    }
}
