package classes;

public class Client extends User{
    public Client(String login, String senha) {
        super(login, senha);
        //TODO Auto-generated constructor stub
    }

    public Client(String name) {
        this.name = name;
    }

    private String name;
    private String id;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
