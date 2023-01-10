import java.util.*;

public class TelaDeExibicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Filmes filmes = new Filmes();
        FilmesAcao filmesAcao = new FilmesAcao(); // fazer um vetor de for para criar cada filme; || pegar as info s e passar para um metodo para ele fazer as atribuições por mim
        FilmesRomance filmesRomance = new FilmesRomance();
        FilmesTerror filmesTerror = new FilmesTerror();

        System.out.println();
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println(" Olá, que bom ver você por aqui! Hoje está um belo dia para assistir filmes!");
        System.out.println("| 1- TODOS OS FILMES | | 2- ESCOLHER POR GENERO |");
        int escolhaInicial = sc.nextInt();

        if(escolhaInicial == 1){
            filmes.todosOsFilmes();
            int escolhaEntreTodosOsFilmes = sc.nextInt();
            if(escolhaEntreTodosOsFilmes <= 12){
                System.out.println();
                System.out.println("| 1- VER INFORMACOES | | 2- COMPRAR BILHETE | | 3- CANCELAR |");
                System.out.println();
                int escolhaFinalTodos = sc.nextInt();
                System.out.println();

                if(escolhaFinalTodos == 1){
                    filmes.getAno();
                    filmes.getClassificacao();
                } 

                else if(escolhaFinalTodos == 2){
                    System.out.println("QUANTIDADE DE BILHETES?");
                    int quantB = sc.nextInt();

                    if(quantB > 1){
                        System.out.println("Todos os bilhetes são para uma mesma sessão?");
                        System.out.println("| 1 - SIM | | 2 - NAO|");
                        int booleano = sc.nextInt();
                        String horario = "";

                        if(booleano == 1){
                            System.out.println();
                            System.out.println("HORARIOS DE EXIBICAO:");
                            System.out.println("| 14h45 | | 16h25 | | 18h05 | | 20h25 | | 22h05 |");
                            System.out.println();
                            sc.nextLine(); // limpando o scanner
                            horario = sc.nextLine(); 
                        }

                        else{
                            for(int i = 0; i < quantB; i++){
                                System.out.println("ESCOLHA O HORARIO DA SESSÃO PARA O " + (i+1) + " BILHETE:");
                                System.out.println();
                                System.out.println("HORARIOS DE EXIBICAO:");
                                System.out.println("| 14h45 | | 16h25 | | 18h05 | | 20h25 | | 22h05 |");
                                System.out.println();
                                sc.nextLine(); // limpando o scanner
                                horario = sc.nextLine(); 
                            }

                            System.out.println();
                            System.out.println("___________" + quantB + " BILHETES RESERVADOS!____________ ");

                            for(int i = 0; i < quantB; i++){
                                System.out.println("BILHETE "+ (i+1) + " RESERVADO PARA AS " + horario);
                            }
                                
                            System.out.println("---------> SIGA PARA O CAIXA 2 ---------->");
                            System.out.println();
                        }
                    }
                }

                else{
                    System.out.println("loading....");
                    System.out.println("*retorna para tela inicial*"); // teria que repetir o codigo do inico aqui dentro
                }
            }
        }        

        else {
            System.out.println("Primeiro, informa qual genero deseja ver hoje: ");
            System.out.println("| 1- ACAO | | 2- ROMANCE | | 3- TERROR |");
            System.out.println();
            int escolhaGenero = sc.nextInt();

            if(escolhaGenero == 1){
                System.out.println();
                System.out.println("FILMES DISPONIVEIS:");
                filmesAcao.escolherFilme();
                System.out.println();
                int escolhaDoFilme = sc.nextInt();

                if(escolhaDoFilme <=5){
                    System.out.println();
                    System.out.println("| 1- VER INFORMACOES | | 2- COMPRAR BILHETE | | 3- CANCELAR |");
                    System.out.println();
                    int escolhaFinal = sc.nextInt();
                    System.out.println();

                    if(escolhaFinal == 1){
                        filmesAcao.getAno();
                        filmesAcao.getClassificacao();
                    } 
                    else if(escolhaFinal == 2){
                        System.out.println("QUANTIDADE DE BILHETES?");
                        int quantB = sc.nextInt();

                        if(quantB > 1){
                            System.out.println("Todos os bilhetes são para uma mesma sessão?");
                            System.out.println("| 1 - SIM | | 2 - NAO|");
                            int booleano = sc.nextInt();
                            String horario = "";

                            if(booleano == 1){
                                System.out.println();
                                System.out.println("HORARIOS DE EXIBICAO:");
                                System.out.println("| 14h45 | | 16h25 | | 18h05 | | 20h25 | | 22h05 |");
                                System.out.println();
                                sc.nextLine(); // limpando o scanner
                                horario = sc.nextLine(); 
                            }
                            else{
                                for(int i = 0; i < quantB; i++){
                                    System.out.println("ESCOLHA O HORARIO DA SESSÃO PARA O " + (i+1) + " BILHETE:");
                                    System.out.println();
                                    System.out.println("HORARIOS DE EXIBICAO:");
                                    System.out.println("| 14h45 | | 16h25 | | 18h05 | | 20h25 | | 22h05 |");
                                    System.out.println();
                                    sc.nextLine(); // limpando o scanner
                                    horario = sc.nextLine(); 
                                }

                                System.out.println();
                                System.out.println("___________" + quantB + " BILHETES RESERVADOS!____________ ");

                                for(int i = 0; i < quantB; i++){
                                    System.out.println("BILHETE "+ (i+1) + " RESERVADO PARA AS " + horario);
                                }
                                    
                                System.out.println("---------> SIGA PARA O CAIXA 2 ---------->");
                                System.out.println();
                            }
                        }
                    }
                    else{
                        System.out.println("loading....");
                        System.out.println("*retorna para tela inicial*");
                    }
                }
            }
            else if(escolhaGenero == 2){
                System.out.println();
                System.out.println("FILMES DISPONIVEIS:");
                filmesRomance.escolherFilme();
                System.out.println();
                int escolhaDoFilme = sc.nextInt();

                if(escolhaDoFilme <=5){
                    System.out.println();
                    System.out.println("| 1- VER INFORMACOES | | 2- COMPRAR BILHETE | | 3- CANCELAR |");
                    int escolhaFinal = sc.nextInt();
                    System.out.println();

                    if(escolhaFinal == 1){
                        filmesRomance.getAno();
                        filmesRomance.getClassificacao();
                    } 
                    else if(escolhaFinal == 2){

                        System.out.println("QUANTIDADE DE BILHETES?");
                        int quantB = sc.nextInt();

                        if(quantB > 1){
                            System.out.println("Todos os bilhetes são para uma mesma sessão?");
                            System.out.println("| 1 - SIM | | 2 - NAO|");
                            int booleano = sc.nextInt();
                            String horario = "";

                            if(booleano == 1){
                                System.out.println();
                                System.out.println("HORARIOS DE EXIBICAO:");
                                System.out.println("| 14h45 | | 16h25 | | 18h05 | | 20h25 | | 22h05 |");
                                System.out.println();
                                sc.nextLine(); // limpando o scanner
                                horario = sc.nextLine(); 
                            }
                            else{
                                for(int i = 0; i < quantB; i++){
                                    System.out.println("ESCOLHA O HORARIO DA SESSÃO PARA O " + (i+1) + " BILHETE:");
                                    System.out.println();
                                    System.out.println("HORARIOS DE EXIBICAO:");
                                    System.out.println("| 14h45 | | 16h25 | | 18h05 | | 20h25 | | 22h05 |");
                                    System.out.println();
                                    sc.nextLine(); // limpando o scanner
                                    horario = sc.nextLine(); 
                                }

                                System.out.println();
                                System.out.println("___________" + quantB + " BILHETES RESERVADOS!____________ ");

                                for(int i = 0; i < quantB; i++){
                                    System.out.println("BILHETE "+ (i+1) + " RESERVADO PARA AS " + horario);
                                }
                                    
                                System.out.println("---------> SIGA PARA O CAIXA 2 ---------->");
                                System.out.println();
                            }
                        }
                    }
                    else{
                        System.out.println("loading....");
                        System.out.println("*retorna para tela inicial*"); 
                    }
                }
            }
            else{
                System.out.println();
                System.out.println("FILMES DISPONIVEIS:");
                filmesTerror.escolherFilme();
                System.out.println();
                int escolhaDoFilme = sc.nextInt();

                if(escolhaDoFilme <=5){
                    System.out.println();
                    System.out.println("| 1- VER INFORMACOES | | 2- COMPRAR BILHETE | | 3- CANCELAR |");
                    int escolhaFinal = sc.nextInt();
                    System.out.println();

                    if(escolhaFinal == 1){
                        filmesTerror.getAno();
                        filmesTerror.getClassificacao();
                    } 
                    else if(escolhaFinal == 2){

                        System.out.println("QUANTIDADE DE BILHETES?");
                        int quantB = sc.nextInt();

                        if(quantB > 1){
                            System.out.println("Todos os bilhetes são para uma mesma sessão?");
                            System.out.println("| 1 - SIM | | 2 - NAO|");
                            int booleano = sc.nextInt();
                            String horario = "";

                            if(booleano == 1){
                                System.out.println();
                                System.out.println("HORARIOS DE EXIBICAO:");
                                System.out.println("| 14h45 | | 16h25 | | 18h05 | | 20h25 | | 22h05 |");
                                System.out.println();
                                sc.nextLine(); // limpando o scanner
                                horario = sc.nextLine(); 
                            }
                            else{
                                for(int i = 0; i < quantB; i++){
                                    System.out.println("ESCOLHA O HORARIO DA SESSÃO PARA O " + (i+1) + " BILHETE:");
                                    System.out.println();
                                    System.out.println("HORARIOS DE EXIBICAO:");
                                    System.out.println("| 14h45 | | 16h25 | | 18h05 | | 20h25 | | 22h05 |");
                                    System.out.println();
                                    sc.nextLine(); // limpando o scanner
                                    horario = sc.nextLine(); 
                                }

                                System.out.println();
                                System.out.println("___________" + quantB + " BILHETES RESERVADOS!____________ ");

                                for(int i = 0; i < quantB; i++){
                                    System.out.println("BILHETE "+ (i+1) + " RESERVADO PARA AS " + horario);
                                }
                                    
                                System.out.println("---------> SIGA PARA O CAIXA 2 ---------->");
                                System.out.println();
                            }
                        }
                    }
                    else{
                        System.out.println("loading....");
                        System.out.println("*retorna para tela inicial*");
                    }
                }
            }
        }
    }
}
