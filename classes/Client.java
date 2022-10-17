package Classes;

import java.io.Serializable;

public class Client extends User implements Serializable{
    public Client(String login, String senha) {
        super(login, senha);
        //TODO Auto-generated constructor stub
    }

    private String name;
    private String id;
    
}
