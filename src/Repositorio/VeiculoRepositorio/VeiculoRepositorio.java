package Repositorio.VeiculoRepositorio;

import Models.Veiculo;
import Repositorio.RepositorioImpl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class VeiculoRepositorio extends RepositorioImpl<Veiculo> {

    public List<Veiculo> listareconomicos(){
        this.list().sort(Comparator.comparingInt(Veiculo::getAutonomia));
        List<Veiculo> economicos= new ArrayList<>();

        economicos= this.list().subList(0,10);
        return economicos;
    }

    public List<Veiculo> listarmenoseconomicos(){

        this.list().sort(Comparator.comparingInt(Veiculo::getAutonomia));
        List<Veiculo> economicos;

       economicos= this.list().subList(9,this.list().size());
       return economicos;
    }


    public List<Veiculo> listarmotorizacao(){
        return this.list();
    }


    public void abastecer(String combustivel,Veiculo veiculo,Integer quantidade){
        veiculo.setDisponível(quantidade);
        veiculo.setMotorizacao(combustivel);
        for(int i=0; i<this.list().size();i++){
            if(this.list().get(i).equals(veiculo)){
                this.update(i,veiculo);
            }
        }

    }


    public List<Veiculo> autonomiainferior(int porcentagem){
        List<Veiculo> autonomiainferior = new ArrayList<>();

        for (Veiculo veiculo : this.list()){
            if(veiculo.getAutonomia() < porcentagem)
                autonomiainferior.add(veiculo);
        }
        return autonomiainferior;
    }


}
