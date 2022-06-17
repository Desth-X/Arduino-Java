/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import com.panamahitek.ArduinoException;
import com.panamahitek.PanamaHitek_Arduino;
import java.io.InputStream;
import jssc.SerialPort;
import jssc.SerialPortEvent;
import jssc.SerialPortEventListener;
import jssc.SerialPortException;

/**
 *
 * @author Desth-X
 */
public class ArduinoController implements SerialPortEventListener {

    PanamaHitek_Arduino arduino;
    InputStream inputStream;
    SerialPort serialPort;

    public ArduinoController() {
        arduino = new PanamaHitek_Arduino();
    }

    public void start() {
        try {
            arduino.arduinoRXTX("COM3", 9600, this);
        } catch (ArduinoException ex) {
            System.out.println(ex);
        }
    }

    public void sendData(String strData) {
        try {
            arduino.sendData(strData);
        } catch (ArduinoException | SerialPortException ex) {
            System.out.println(ex);
        }
    }

    public void stop() {
        try {
            arduino.killArduinoConnection();
        } catch (ArduinoException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void serialEvent(SerialPortEvent spe) {
        
    }
   
}
