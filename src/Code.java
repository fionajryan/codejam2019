import javax.swing.*;
import java.awt.*;

public class Code extends JPanel{


    public static void main(String[] args) {
        JFrame frame = new JFrame("Drawing Lines");
        frame.setBackground(Color.white);
        frame.setSize(200, 200);
        Code panel = new Code();
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public Code(){
        repaint();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.drawLine(0,0,100,100);
    }
    public void loop(){
        /*
            Call script to get image
            process image
            get values
            calculate change
            draw
            repetez

         */
    }
}
