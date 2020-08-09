import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class displayFooData {
    // initialize class variables
    int x;
    int y;
    int rotation;

    Scanner scan = new Scanner(System.in);

    public displayFooData() {
        JFrame frame = new JFrame("Robot Simulator");
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Actual JPanel Graphics


        frame.add(new JPanel() {
            public void paintComponent(Graphics g) {
                g.drawString("Robot x = " + x, 10, 20);
                g.drawString("Robot y = " + y, 10, 60);
                g.drawString("Robot rotation = " + rotation, 10, 100);

                // blit image
                g.setColor(Color.YELLOW);
                g.fillRect(x, y, 100, 30);

                repaint();
                revalidate();
            }

        });
    }

    public int getInput(String message){
        System.out.println("Set " + message + ":");
        String input = scan.next();

        return Integer.parseInt(input);
    }

    public void updateRobotPose() {
        x = getInput("X");
        y = getInput("Y");
        rotation = getInput("Rotation");
    }


    // Initialize Getters
    public int getX(){
        return x;
    }

    public int getY(){return y;}

    public int getRotation(){return rotation;}

}
