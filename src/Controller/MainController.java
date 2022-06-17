/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author Desth-X
 */
public class MainController implements ActionListener {

    ArduinoController arduinoController;

    public MainController() {
        arduinoController = new ArduinoController();
        arduinoController.start();
        //arduinoModel.stop();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        arduinoController.sendData(e.getActionCommand());
    }

}
