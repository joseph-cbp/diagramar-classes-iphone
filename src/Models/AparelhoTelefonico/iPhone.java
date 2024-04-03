package Models.AparelhoTelefonico;

import Models.Navegador.INavegadorNaInternet;
import Models.Navegador.NavegadorNaInternet;
import Models.ReprodutorMusical.IReprodutorMusical;
import Models.ReprodutorMusical.ReprodutorMuscal;

public class iPhone implements IAparelhoTelefonico{

    private IReprodutorMusical reprodutorMusical;
    private INavegadorNaInternet navegadorNaInternet;

    public iPhone(){
        reprodutorMusical = new ReprodutorMuscal();
        navegadorNaInternet = new NavegadorNaInternet();
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida");
        
    }

    @Override
    public void ligar(int numero) {
        String res = String.format("ligando para %d", numero);
        System.out.println(res);
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("iniciando correio de Voz");
    }
}
