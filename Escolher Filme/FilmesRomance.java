public class FilmesRomance extends Filmes{
// tornei tudo generico
    private int ano = 2022;
    private String classificacao = "4.5 estrelas";
    

    public int getAno() {
        return ano;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }


    public String getClassificacao() {
        return classificacao;
    }


    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }


    @Override
    public void escolherFilme(){
        System.out.println("1 - ATRAVES DA MINHA JANELA");
        System.out.println("2 - CONTINENCIA AO AMOR");
        System.out.println("3 - DIARIO DE UMA PAIXAO");
        System.out.println("4 - LA LA LAND");
    }    
}
