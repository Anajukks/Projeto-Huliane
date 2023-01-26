import java.util.*;

public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Filmes filmes = new Filmes();
        Filmes aBelaeAFera = new Filmes(2020, "4.3 estrelas", "Moradora de uma pequena vila francesa, Bela teve seu pai capturado por uma Fera e decidiu entregar-se ao estranho ser em troca da liberdade de seu pai.", "Romance/Fantasia", "1h50min");
        Filmes gatoDeBotas2 = new Filmes(2022,"4.8 estrelas", "O Gato de Botas descobre que sua paixão pela aventura cobrou seu preço: ele já gastou oito de suas nove vidas. Ele então parte em uma jornada épica para encontrar o mítico Último Desejo e restaurar suas nove vidas.", "Aventura/Comédia", "1h42min");
        Filmes megan = new Filmes(2022,"4.5 estrelas", "M3GAN é uma maravilha da inteligência artificial, uma boneca realista programada para ser a melhor amiga de uma criança. Uma robótica brilhante dá a sua jovem sobrinha um protótipo M3GAN, mas a máquina logo se torna violenta.", "Terror/Ficcao Cientifica", "1h47min");
        Filmes avatar2 = new Filmes(2022,"4.8 estrelas", "Após formar uma família, Jake Sully e Ney'tiri fazem de tudo para ficarem juntos. No entanto, eles devem sair de casa e explorar as regiões de Pandora quando uma antiga ameaça ressurge, e Jake deve travar uma guerra difícil contra os humanos.", "Ficcao Cientifica/Fantasia", "3h15min");
        Filmes coringa = new Filmes(2019,"5 estrelas", "Isolado, intimidado e desconsiderado pela sociedade, o fracassado comediante Arthur Fleck inicia seu caminho como uma mente criminosa após assassinar três homens em pleno metrô. Sua ação inicia um movimento popular contra a elite de Gotham City, da qual Thomas Wayne é seu maior representante.", "Suspense/Drama", "2h05min");
        Filmes velozesEFuriosos10 = new Filmes(2023,"4.7 estrelas", "Velozes e Furiosos 10 mostra Dominic Toretto comandando novamente a equipe de corredores mais conhecida do mundo, em mais uma difícil missão sobre quatro rodas.", "Ação/Aventura", "2h15min");
        FuncionamentoSistema funcionamentoInterno = new FuncionamentoSistema();

        System.out.println("=============== Bem vindo ao Cinema LEJUPA ===============");
        filmes.EmExibicao();
        System.out.println();
        System.out.println("Qual a escolha de hoje? =)");
        int escolha1 = sc.nextInt();

        if(escolha1 < 7){
            if(escolha1 == 1){
                System.out.println();
                System.out.println("========== INFORMACOES DO FILME: ========== ");
                System.out.println(aBelaeAFera);
                System.out.println();
            }
            if(escolha1 == 2){
                System.out.println();
                System.out.println("========== INFORMACOES DO FILME: ========== ");
                System.out.println(gatoDeBotas2);
                System.out.println();
            }
            if(escolha1 == 3){
                System.out.println();
                System.out.println("========== INFORMACOES DO FILME: ========== ");
                System.out.println(megan);
                System.out.println();
            }
            if(escolha1 == 4){
                System.out.println();
                System.out.println("========== INFORMACOES DO FILME: ========== ");
                System.out.println(avatar2);
                System.out.println();
            }
            if(escolha1 == 5){
                System.out.println();
                System.out.println("========== INFORMACOES DO FILME: ========== ");
                System.out.println(coringa);
                System.out.println();
            }
            if(escolha1 == 6){
                System.out.println();
                System.out.println("========== INFORMACOES DO FILME: ========== ");
                System.out.println(velozesEFuriosos10);
                System.out.println();
            }

            System.out.println("| 1- COMPRAR BILHETE | | 2- CANCELAR |");
            System.out.println();
            int escolha2 = sc.nextInt();
            System.out.println();

            if(escolha2 == 1){
                System.out.println("QUANTIDADE DE BILHETES?");
                int quantB = sc.nextInt();

                if(quantB > 1){ // se comprar mais de um bilhete
                    System.out.println("Todos os bilhetes são para uma mesma sessão?");
                    System.out.println("| 1- SIM | | 2- NAO |");
                    int booleano = sc.nextInt();

                    if(booleano == 1){ 
                        filmes.HorariosExb();
                        int horario = sc.nextInt(); 
                        System.out.println();
                        System.out.println("___________BILHETE RESERVADO!____________ ");
                        System.out.print("BILHETE RESERVADO PARA AS " + horario);
                        //pagamento e codigo
                    }

                    else{    
                        int[] horario = new int[quantB];
                            
                        for(int i = 0; i < quantB; i++){ // escolha de horario para cada bilhete
                            System.out.println("ESCOLHA O HORARIO DA SESSÃO PARA O " + (i+1) + "° BILHETE:");
                            filmes.HorariosExb();
                            horario[i] = sc.nextInt(); 
                        }

                        System.out.println();
                        System.out.println("___________" + quantB + " BILHETES RESERVADOS!____________ ");

                        for(int i = 0; i < quantB; i++){
                            System.out.print("BILHETE "+ (i+1) + " RESERVADO PARA AS ");
                            if(horario[i] == 1){
                                System.out.println("14h45");
                            }
                            else if(horario[i] == 2){
                                System.out.println("17h05");
                            }
                            else{
                                System.out.println("20h25");
                            }
                        }
                            //pagamento e codigo
                    }
                }
                else{
                    filmes.HorariosExb();
                    int horario = sc.nextInt(); 
                    System.out.println();
                    System.out.println("___________BILHETE RESERVADO!____________ ");
                    System.out.print("1 BILHETE RESERVADO PARA AS ");
                    if(horario == 1){
                        System.out.println("14h45");
                    }
                    else if(horario == 2){
                        System.out.println("17h05");
                    }
                    else{
                        System.out.println("20h25");
                    }
                }            
            }
            else{
                funcionamentoInterno.Retornar();
            }
        }
    }
}
