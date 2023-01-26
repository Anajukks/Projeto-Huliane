public class Filmes {
    int ano;
    String classificacao;
    String resumo;
    String genero;
    String duracao;

    public Filmes(){ // para poder chamar as funçoes
    }
    
    public Filmes(int ano, String classificacao, String resumo, String genero, String duracao){
        this.ano = ano;
        this.classificacao = classificacao;
        this.resumo = resumo;
        this.genero = genero;
        this.duracao = duracao;
    }

    public void EmExibicao(){
        System.out.println("=========== FILMES EM EXIBICAO ==========");
        System.out.println();
        System.out.println("1 - A Bela e A Fera");
        System.out.println("2-O Gato de Botas 2");
        System.out.println("3- M3GAN");
        System.out.println("4- Avatar 2");
        System.out.println("5- Coringa");
        System.out.println("6- Velozes e Furiosos 10");
    }

    public void HorariosExb(){
        System.out.println();
        System.out.println("HORARIOS DE EXIBICAO:");
        System.out.println("| 1- 14h45 | | 2- 17h05 | | 3- 20h25 |");
        System.out.println();
    }

    @Override
    public String toString() {
        return "ANO: " + ano + "\nCLASSIFICACAO: " + classificacao + "\nRESUMO: " + resumo + "\nGENERO: " + genero
                + "\nDURACAO: " + duracao;
    }
}