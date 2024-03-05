package edu.badpals.stockx;

import edu.badpals.stockx.item.Item;
import edu.badpals.stockx.item.Sneaker;

/**
 * StockX nació en Detroit, y allí siguen haciendo
 * las cosas a la manera tradicional, 
 * robustas y con alma, en ASCII en la CLI.
 *
 * Implementa las historias de usuario 
 * de las GUI proporcionadas, pero en ASCII.
 *
 * La lógica tras cada historia de usuario 
 * está descrita en el `main` de la clase
 * principal `Stockx.java`.
 *
 * Si tienes dudas, puedes interactuar con
 * la webapp based in London que sí que tiene (G)UI
 * https://stockx.com/air-jordan-1-retro-high-dark-mocha
 */


public class Stockx {

    public static void main(String[] args) {

        /**
         * Crear la zapatilla 
         * y printar sus datos.
         *
         * Lee la funcion draw() del main
         * para conocer que propiedades
         * de la zapatilla han de printarse.
         */
/*
        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        System.out.println(Stockx.draw(sneaker));

        /**
         * Crear bids
         * y añadirlas a la zapatilla
         * en sus offers.
         */

/*
    }

    public static String draw(Item sneaker) {
        return
                "\n\n\t\t" + sneaker.getAsk() + " Buy\t"
                        + sneaker.getBid() + " Sell \n" +

                        "\t\t" + " _    _" + "\n" +
                        "\t\t" + "(_\\__/(,_" + "\n" +
                        "\t\t" + "| \\ `_////-._" + "\n" +
                        "\t\t" + "J_/___\"=> __/`\\" + "\n" +
                        "\t\t" + "|=====;__/___./" + "\n" +
                        "\t\t" + "\'-\'-\'-\"\"\"\"\"\"\"`" + "\n" +

                        "\t" + sneaker.toString() + "\n" +
                        "\t\tlast sale: " + sneaker.getSale();
    }
*/
}
}