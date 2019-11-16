import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class code implements MouseListener {

    public static void main(){
        Frame frame = new Frame();
        JPanel panel = new JPanel();
        frame.add(panel);

    }

    public void line (Graphics a){
        a.drawLine(0,0,100,100);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e){
        line = drawLine(e.getX(),e.getY(),e.getX(),e.getY());


    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
