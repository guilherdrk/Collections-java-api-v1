package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<NumeroInt> numerosList;

    public SomaNumeros(){
        numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numerosList.add(new NumeroInt(numero));
    }
    public int calcularSoma(){
        int somaDosNumeros = 0;
        if(!numerosList.isEmpty()){
            for (NumeroInt numeroInt : numerosList){
                somaDosNumeros += numeroInt.getNumero();
            }
        }
        return somaDosNumeros;
    }
    public int encontrarMaiorNumero(){
        int maiorNumero = 0;
        if (!numerosList.isEmpty()){
            for (NumeroInt numAtual : numerosList) {
                if (numAtual.getNumero() >= (numAtual.getNumero() + 1)) {
                    maiorNumero = numAtual.getNumero();
                } else {
                    maiorNumero = (numAtual.getNumero() + 1);
                }
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = 0;
        if (!numerosList.isEmpty()){
            for (NumeroInt numAtual : numerosList) {
                if (numAtual.getNumero() <= (numAtual.getNumero() + 1)) {
                    menorNumero = numAtual.getNumero();
                } else {
                    menorNumero = (numAtual.getNumero() + 1);
                }
            }
        }
        return menorNumero;
    }

    public void exibirNumeros(){
        System.out.println(numerosList);
    }


}
