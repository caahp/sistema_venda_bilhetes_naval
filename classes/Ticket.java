package Classes;

import java.sql.Date;

public class Ticket {
    private String name;
    private Rote rote;
    private Date hour;
    
    public Ticket(String name, Rote rote, Date hour) {
        this.name = name;
        this.rote = rote;
        this.hour = hour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rote getRote() {
        return rote;
    }

    public void setRote(Rote rote) {
        this.rote = rote;
    }

    public Date getHour() {
        return hour;
    }

    public void setHour(Date hour) {
        this.hour = hour;
    }

    public void confirmarCompra() {

    }
}
