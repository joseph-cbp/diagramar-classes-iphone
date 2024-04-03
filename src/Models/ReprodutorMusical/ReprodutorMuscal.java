package Models.ReprodutorMusical;

public class ReprodutorMuscal implements IReprodutorMusical{
    @Override
    public void pausarMusica() {
        System.out.println("Pausando Música");
        
    }
    @Override
    public void tocarMusica() {
        System.out.println("Tocando Música");
        
    }
    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando Música");
        
    }
}
