package Classes;

import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        User user = new User("danilo bruno da silva", "danilo123");
        Scanner input = new Scanner(System.in);
        
         if (user.verificarUsuarioSenha()){System.out.println("OK");}
         else{System.out.println("errado.");}
         
         MainManager adm = new MainManager();

         for (int i=0;i<2;i++){
             adm.cadastrarCliente(input.nextLine().toLowerCase());
        }
        
        BoatManager boatManager = new BoatManager();
        boatManager.cadastrarBarco("barco vermelho lula");
        boatManager.cadastrarBarco("barco do bolsonaro");

        RoteManager roteManager = new RoteManager();
        roteManager.cadastrarRota("Coari");
        roteManager.cadastrarRota("Caribe");

    }
}
