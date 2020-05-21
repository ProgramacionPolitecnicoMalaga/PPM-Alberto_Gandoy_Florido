package factory;

public class SelectorDePizza {
    public static Pizza getPizza(int tipoPizza) {
        if (tipoPizza == Pizza.ESTACIONES)
             return new Pizza4Estaciones();
        else if (tipoPizza == Pizza.MARGARITA)
             return new PizzaMargarita();
        else if (tipoPizza == Pizza.PROSCIUTTO)
            return new PizzaProsciutto();
        else if (tipoPizza == Pizza.VEGANA)
            return new PizzaVegana();
        else
            return new PizzaMargarita();
    }
}
