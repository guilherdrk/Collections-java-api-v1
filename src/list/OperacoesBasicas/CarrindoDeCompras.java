package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrindoDeCompras {
    //atributo

    private List<Item> listaItem;

    public CarrindoDeCompras(){
        this.listaItem = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.listaItem.add(item);
    }

    public void removerItem(String nome){
        List<Item> listaParaRemoverItem = new ArrayList<>();
        if (!listaItem.isEmpty()){
            for (Item item : listaItem){
                if (item.getNome().equalsIgnoreCase(nome)){
                    listaParaRemoverItem.add(item);
                }
            }
            listaItem.removeAll(listaParaRemoverItem);
        } else {
            System.out.println("A lista está vazia");

        }
    }

    public float calcularValorTotal() {
        float valorTotal = 0;
        if (!listaItem.isEmpty()) {
            for (Item item : listaItem) {
                int quantidadeItens = item.getQuantidade();
                valorTotal += item.getPreco() * quantidadeItens;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }
    public void exibirItens(){
       if (!listaItem.isEmpty()){
           for (int i = 0; i < listaItem.size(); i++){
               System.out.println("Item - " + (i + 1));
               System.out.println("Nome: " + listaItem.get(i).getNome());
               System.out.println("Preço: " + listaItem.get(i).getPreco());
               System.out.println("Quantidade: " + listaItem.get(i).getQuantidade());
           }
       }else{
           System.out.println("A lista está vazia!");
       }
    }

}
