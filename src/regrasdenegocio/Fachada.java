package regrasdenegocio;
import Models.Veiculo;
import Repositorio.VeiculoRepositorio.VeiculoRepositorio;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class Fachada {

    private VeiculoRepositorio rep;

   public List<Veiculo> listarmaiseconomicos(){
    return this.rep.listareconomicos();
   }

   public List<Veiculo> listarmenoseconomicos(){
       return this.rep.listarmenoseconomicos();
   }

   public List<Veiculo> listarveiculos(){
       return this.rep.listarmotorizacao();
   }

   public void abastacer(String combustivel, Veiculo veiculo, Integer qtd){
       this.rep.abastecer(combustivel,veiculo,qtd);
   }

   public List<Veiculo> autonomiainferior(Integer porcentagem){
       return this.rep.autonomiainferior(porcentagem);
   }

}
