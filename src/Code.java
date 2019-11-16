import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Code extends JPanel {


    public static void main(String[] args) {

        JFrame frame = new JFrame("Drawing Lines");
        frame.setBackground(Color.white);
        frame.setSize(200, 200);
        Code panel = null;
        try {
            panel = new Code();
        } catch (IOException e) {
            e.printStackTrace();
        }
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public Code() throws IOException {
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.drawLine(0, 0, 100, 100);
    }

    public void loop() {
        /*
            Call script to get image
            process image
            get values
            calculate change
            draw
            repetez

         */


        try {
            Scanner scan = new Scanner(new BufferedReader(new FileReader("C:\\Users\\tmjed\\PycharmProjects\\CodeJam\\venv\\Scripts\\rsc\\vals.txt")));
            scan.useDelimiter(",");
            LinkedList<Double> list = new LinkedList<>();
            while (scan.hasNextFloat()) {
                list.add(scan.nextDouble());
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }


        try {
            String s = null;
            Process p = Runtime.getRuntime().exec("python C: /Users/fionaryan/Desktop/program.py, 4");
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            while ((s = reader.readLine()) != null) System.out.println(s);

        }
        catch (IOException e) {
            System.out.println("Exception in reading output" + e.toString());
        }

    }
}


