package Classes;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class MainManager{
    public void cadastrarCliente(String nomeCliente){
        try{
            FileWriter fw = new FileWriter("clientesCadastrados.txt", true);
            BufferedWriter escritor = new BufferedWriter(fw);
            
            escritor.write(nomeCliente);
            escritor.newLine();
            escritor.close();
        }     
        catch (IOException error){
            error.printStackTrace();
        }   
    }
}
