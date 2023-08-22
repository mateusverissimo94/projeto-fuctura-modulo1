package Pizzaria;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
	private List<Pizza> pizzas;

    public Cardapio() {
        this.pizzas = new ArrayList<>();
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void adicionarPizza(Pizza pizza) {
        this.pizzas.add(pizza);
    }
}
