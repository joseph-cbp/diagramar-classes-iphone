package Models.Navegador;

import java.util.ArrayList;
import java.util.List;

public class NavegadorNaInternet implements INavegadorNaInternet{

    public List<String> paginaList;
    public NavegadorNaInternet(){
        paginaList = new ArrayList<String>();   
    }

    @Override
    public void exibirPagina(int index) {
        try {
            var page = paginaList.get(index);
            System.out.println(page);
            
        } catch (Exception e) {
            System.out.println("Indice não encontrado");
        }
    }

    @Override
    public void adicionarNovaAba(String pagina) {
        this.paginaList.add(pagina);
        String response = String.format("%s adicionada", pagina);
        System.out.println(response);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página Atualizada"); 
    }

}
