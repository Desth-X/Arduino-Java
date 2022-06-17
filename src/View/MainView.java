/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JButton;
import Controller.MainController;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;

/**
 *
 * @author Desth-X
 */
public class MainView extends JFrame {

    Container container;
    MainController mainController;

    public MainView() {
        super("Arduino");
        mainController = new MainController();
        createGUI();
    }

    private void createGUI() {
        setUndecorated(true);
        container = getContentPane();
        setBackground(new Color(0, 0, 0, 150));
        container.setPreferredSize(new Dimension(315, 315));
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        for (int i = 0; i <= 15; i++) {
            container.add(
                    createButton(Integer.toString(i).toUpperCase(),
                            50 * (i % 4) + (i % 4) * 5 + 50, /// X
                            i / 4 * 50 + i / 4 * 5 + 50,  // Y
                            50, 50)); // alto + ancho
        }
    }

    private JButton createButton(
            String strButtonText, int intX, int intY, int intW, int intH) {
        JButton btnButton = new JButton(strButtonText) {
            @Override
            protected void paintComponent(Graphics g) {
                g.setColor(new Color(0, 0, 0, 175));
                g.fillRect(0, 0, getWidth(), getHeight());
                super.paintComponent(g);
            }
        };
        btnButton.setOpaque(false);
        btnButton.setForeground(Color.WHITE);
        btnButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnButton.setBorderPainted(false);
        btnButton.setContentAreaFilled(false);
        btnButton.setBounds(intX, intY, intW, intH);
        btnButton.setActionCommand(strButtonText);
        btnButton.addActionListener(mainController);
        return btnButton;
    }

    public static void main(String[] args) {
        MainView mainView = new MainView();
        mainView.setVisible(true);
    }
}
