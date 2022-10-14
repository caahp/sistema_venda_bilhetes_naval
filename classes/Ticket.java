package Classes;

import java.sql.Date;

public class Ticket {
    String name;
    String rote;
    Date hour;
    Double preco;
    Payment typeOfPayment;

    
    public Ticket(String name, Rote rote, Date hour, Double preco, Payment typeOfPayment) {
        this.name = name;
        this.rote = rote.getDestination();
        this.hour = hour;
        this.preco = preco;
        this.typeOfPayment = typeOfPayment;
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
