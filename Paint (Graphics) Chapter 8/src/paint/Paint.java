/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paint;

/**
 *
 * @author User
 */

import java.awt.*;
import javax.swing.*;

public class Paint extends JPanel{

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Paint");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.add(new Paint());
        frame.setVisible(true);
    }
    
    
    public void paint(Graphics g) {

        super.paint(g);

        g.setFont(new Font("Times New Roman", Font.BOLD + Font.ITALIC,24));
        g.drawString("This is Kriper from Mainkraft",10,20);
        
        
        g.setColor(Color.BLACK);
        g.drawLine(5, 30, 380, 30);
        
        this.setBackground(new Color(0, 200, 0));
        
        g.fillRect(101, 60, 30, 30);
        g.fillRect(170, 60, 30, 30);
        g.fillRect(120, 100, 60, 20);
        g.fillRect(135, 80, 30, 20);
        g.fillRect(120, 120, 20, 35);
        g.fillRect(160, 120, 20, 35);
        
        
    }
}
