package classes;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;


public class User{
    private static boolean verificador;
    private static boolean token;
    public  String login;
    public  String senha;

    public User(){
        
    }

    public User(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }


    public boolean verificarUsuarioLogin(){
        try{
            FileReader fw = new FileReader("funcionarioNome.txt");
            BufferedReader ler = new BufferedReader(fw);

            while (ler.ready()){
                String linha = ler.readLine ();
                if (linha.contains(login)){
                    token = true;
                    break;
                }
                else{
                    token = false;
                }
            }
            ler.close();
            fw.close();
        }
        catch (IOException error){
            error.printStackTrace();
        }
        if (token == true){
            verificador = true;
        }
        else{
            verificador = false;
        }
    return verificador;
    }

    public boolean verificarUsuarioSenha(){
        try{
            FileReader fr = new FileReader("sistema_venda_bilhetes_naval/funcionarioSenha.txt");
            BufferedReader ler = new BufferedReader(fr);
            while (ler.ready()){
                String linha = ler.readLine();
                if (linha.contains(senha)){
                    token = true;
                    break;
                }
                else{
                    token = false;
                }
            }
            ler.close();
            fr.close();
        }
        catch (IOException error){
            error.printStackTrace();
        }
        if (token == true){
            verificador = true; 
        }
        else{
            verificador = false;
        }
        return verificador;
    }
}
