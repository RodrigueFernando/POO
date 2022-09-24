import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

       Bebida bebida = new Bebida("doce", "20", 5);
        Cerveja cerveja = new Cerveja("amargo", "15", 50, 10);
        Vinho vinho = new Vinho("seco","10",3,"importada","brasil");

        Ingrediente ingrediente1 = new Ingrediente("cebola");
        Ingrediente ingrediente2 = new Ingrediente("tomate");
        Ingrediente ingrediente3 = new Ingrediente("milho");
        Ingrediente ingrediente4 = new Ingrediente("azeitona");

        List<Ingrediente> ingredientespizza1 = new ArrayList<>();

        ingredientespizza1.add(ingrediente1);
        ingredientespizza1.add(ingrediente2);
        ingredientespizza1.add(ingrediente3);
        ingredientespizza1.add(ingrediente4);


        Ingrediente ingredientepizza1 = new Ingrediente("queijo");
        Ingrediente ingredientepizza2 = new Ingrediente("bacon");
        Ingrediente ingredientepizza3 = new Ingrediente("mussarela");

        List<Ingrediente> ingredientesSegundapizza = new ArrayList<>();

        ingredientesSegundapizza.add(ingredientepizza1);
        ingredientesSegundapizza.add(ingredientepizza2);
        ingredientesSegundapizza.add(ingredientepizza3);


        Pizza pizza = new Pizza("pequena", "20", true, ingredientespizza1);
        Pizza pizza1 = new Pizza("grande", "40", false, ingredientesSegundapizza);
        pizza.mostraDados();
        List<Produto> produtos = new ArrayList<>();

        produtos.add(pizza);
        produtos.add(pizza1);
        produtos.add(bebida);
        produtos.add(cerveja);
        produtos.add(vinho);

        for (Produto p : produtos) {
            p.mostraDados();
        }

    }
}
