public class FilmesAcao extends Filmes{
// tornei tudo generico
    private int ano = 2022;
    private String classificacao = "5 estrelas";
    public int getAno() {
        return ano;
    }

    public String getClassificacao() {
        return classificacao;
    }


    @Override
    public void escolherFilme(){
        
        System.out.println("1 - MISSAO IMPOSSIVEL");
        System.out.println("2 - PANTERA NEGRA");
        System.out.println("3 - VELOZES E FURIOSOS 9");
        System.out.println("4 - VENOM");
    }


}
