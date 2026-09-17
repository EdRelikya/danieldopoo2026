package sGaragem;

import java.util.ArrayList;

public class Garagem {


    ArrayList<Veiculo> veiculos;

    Garagem(){
        this.veiculos = new ArrayList<Veiculo>();
    }


    public boolean adicionarVeiculo(Veiculo v){
        for(Veiculo a : veiculos){
            if (a.getPlaca().equals(v.getPlaca())) {
                return false;
            }
        }
        veiculos.add(v);
        return true;
    }


    public ArrayList<Veiculo> listarVeiculos(){
        return veiculos;
    }


    public  Veiculo buscarVeiculo(String placa){
        for(Veiculo v : veiculos){
            if (v.getPlaca().equals(placa)) {
                return v;
            }
        }
        return null;
    }

    public  boolean removerVeiculo(String placa){
        for(Veiculo v : veiculos){
            if (v.getPlaca().equals(placa)) {
                veiculos.remove(v);
                return true;
            }

        }
        return  false;
    }


    
}
