/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author hylke
 */

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class PickPanel extends JPanel {


    public PickPanel() {
        setPreferredSize(new Dimension(1920, 1080));
   
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.GRAY);

        g.setColor(Color.BLACK);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(7));
//        vertical lijnen
//        g.drawLine(190, 0, 190, 950);
//        g.drawLine(380, 0, 380, 950);
//        g.drawLine(570, 0, 570, 950);
//        g.drawLine(760, 0, 760, 950);
        int x = 190;
        for (int i = 0; i < 4; i++) {
            
            g.drawLine(x, 10, x, 950);
            x = x + 190;
        }
//      horizontale lijnen
//        g.drawLine(0, 190, 950, 190);
//        g.drawLine(0, 380, 950, 380);
//        g.drawLine(0, 570, 950, 570);
//        g.drawLine(0, 760, 950, 760);

        int y = 190;
        for (int i = 0; i < 4; i++) {
            
            g.drawLine(10, y, 950, y);
            y = y + 190;
        }
        g.drawRect(0, 0, 950, 950);

        


    }
}