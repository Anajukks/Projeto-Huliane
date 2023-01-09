public class FilmesTerror extends Filmes{
// tornei tudo generico
    int ano = 2021;
    String classificacao = "4 estrelas";
   


    @Override
    public void escolherFilme(){
        System.out.println("1 - A FREIRA");
        System.out.println("2 - HEREDITARIO");
        System.out.println("3 - INVOCACAO DO MAL");
        System.out.println("4 - TERRIFIER");
    }    
}
