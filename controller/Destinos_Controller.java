/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.Agendamento;
import view.Destinos;

/**
 *
 * @author PauloR
 */
public class Destinos_Controller {
    private final Destinos view;
    
    public Destinos_Controller(Destinos view){
        this.view = view;
    }
    
    public void goAgendamentoScreen(){
        Agendamento agendamento = new Agendamento();
        agendamento.setVisible(true);
        this.view.dispose();
    }
    
    
    
}
