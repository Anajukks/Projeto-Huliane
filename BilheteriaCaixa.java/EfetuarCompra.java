import java.util.*;

public class EfetuarCompra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem Vindo!");
        System.out.print("Login: ");
        String login = sc.nextLine();
        System.out.print("Senha: ");
        String senha = sc.nextLine();

        String loginFuncionario = "20211101110004";
        String senhaFuncionario = "CinemaFeliz";

        for(int i = 0; i < 6; i++){ // 6 funcionarios
            if(login == loginFuncionario && senha == senhaFuncionario){
               System.out.println("Iniciando sistema...");

               System.out.println("1 NOTIFICACAO");
               System.out.println("| 1 - ABRIR MAIS RECENTE | | 2 - EXIBIR TODAS AS NOT. |");
               int notifi = sc.nextInt();
               if(notifi == 1){
                System.out.println("1 RESERVA PARA A SALA B-2");
               }
            }
            else{
               System.out.println("Login ou senha incorreto. Tente novamente.");
            }
        }

    }
}
