package Models;

import java.beans.JavaBean;

@JavaBean
public class Veiculo {
    private String marca;
    private String modelo;

    private Integer autonomia;

    private String motorizacao;

    private Integer capacidade;

    private Integer disponível;

    public Veiculo(){};

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca=marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo=modelo;
    }


    public Integer getAutonomia(){
        return this.autonomia;
    }

    public void setAutonomia(Integer autonomia){
        this.autonomia=autonomia;
    }



    public String getMotorizacao(){
        return this.motorizacao;
    }

    public void setMotorizacao(String motorizacao){
        this.motorizacao=motorizacao;
    }



    public Integer getCapacidade(){
        return this.capacidade;
    }

    public void setCapacidade(Integer capacidade){
        this.capacidade=capacidade;
    }


    public Integer getDisponível(){
        return this.disponível;
    }

    public void setDisponível(Integer disponivel){
        this.disponível=disponivel;
    }



}
