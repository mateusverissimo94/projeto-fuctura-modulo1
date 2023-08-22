package Pizzaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner leIngredientes = new Scanner(System.in);
        Cardapio cardapio = new Cardapio();
        System.out.println("Cadastrando Pizza no Cardapio");
        String nome, ingredientes, resposta;
        double valor;

        while (true){
            System.out.println("Digite o nome da Pizza:");
            nome = input.next();

            System.out.println("Digite os ingredientes dessa Pizza:");
            ingredientes = leIngredientes.nextLine();

            System.out.println("Digite o valor dessa Pizza:");
            valor = input.nextDouble();

            Pizza pizza = new Pizza(nome, ingredientes, valor);
            cardapio.adicionarPizza(pizza);

            System.out.println("Deseja continuar a cadastrar: (S - sim, N - não)");
            resposta = input.next();

            if (resposta.toUpperCase().equals("N")){
                break;
            }
        }


        System.out.println(cardapio.getPizzas());

    }
}

//        Pizza pizza1 = new Pizza("Mussarela", "Mussarela, tomate, azeitonas e orégano", 29);
//        Pizza pizza2 = new Pizza("Calabresa", "Mussarela, calabresa, cebola e orégano", 31);
//        Pizza pizza3 = new Pizza("Presunto", "Mussarela, presunto, tomate, e orégano", 32);
//        Pizza pizza4 = new Pizza("Frango", "Mussarela, frango, azeitonas e orégano", 32);
//        Pizza pizza5 = new Pizza("Frango Caipira", "Mussarela, bacon, frango, milho e orégano", 36);
//        Pizza pizza6 = new Pizza("Frango Com Catupiry", "Mussarela, frango, catupiry e orégano", 38);
//        Pizza pizza7 = new Pizza("Frango Com Cheddar", "Mussarela, frango, cheddar e orégano", 38);
//        Pizza pizza8 = new Pizza("Três Queijos", "Mussarela, cheddar, Catupiry e orégano", 39);
//        Pizza pizza9 = new Pizza("Portuguesa", "Mussarela, presunto, bacon, " +
//                "calabresa, ovo cozido, cebola, milho, ervilha, tomate, pimentão, orégano e azeitonas", 49);
//        Cardapio cardapio = new Cardapio();
//
//        cardapio.adicionarPizza(pizza1);
//        cardapio.adicionarPizza(pizza2);
//        cardapio.adicionarPizza(pizza3);
//        cardapio.adicionarPizza(pizza4);
//        cardapio.adicionarPizza(pizza5);
//        cardapio.adicionarPizza(pizza6);
//        cardapio.adicionarPizza(pizza7);
//        cardapio.adicionarPizza(pizza8);
//        cardapio.adicionarPizza(pizza9);
//
//        for (Pizza p: cardapio.getPizzas()){
//            System.out.println(p.getNome() + " - " + p.getIngredientes());
//        }
