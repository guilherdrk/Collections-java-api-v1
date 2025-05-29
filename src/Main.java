import list.OperacoesBasicas.CarrindoDeCompras;
import list.OperacoesBasicas.Item;

import java.text.Format;

public class Main {
    public static void main(String[] args) {
        CarrindoDeCompras carrindoDeCompra = new CarrindoDeCompras();
        Item item1 = new Item("Notebook Lenovo i3", 1900, 5);
        Item item2 = new Item("Controle PS4 Usado", 240, 3);
        Item item3 = new Item("Tablet Samsung S20", 1460, 2);
        Item item4 = new Item("Chaveiro Corinthians", 60, 10);

        carrindoDeCompra.adicionarItem(item1.getNome(), item1.getPreco(), item1.getQuantidade());
        carrindoDeCompra.adicionarItem(item2.getNome(), item2.getPreco(), item2.getQuantidade());
        carrindoDeCompra.adicionarItem(item3.getNome(), item3.getPreco(), item3.getQuantidade());
        carrindoDeCompra.adicionarItem(item4.getNome(), item4.getPreco(), item4.getQuantidade());

        carrindoDeCompra.removerItem(item1.getNome());


        carrindoDeCompra.exibirItens();
        System.out.println("Valor total: " + carrindoDeCompra.calcularValorTotal());

    }
}