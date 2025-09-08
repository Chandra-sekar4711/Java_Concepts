package sample;

import java.awt.Robot;
import java.awt.AWTException;
import java.awt.Point;
import java.awt.MouseInfo;

public class sam1 {
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            String s="chandrasekar";
            
            while (true) {
                System.out.println("Cursor moved!");

                // Get current mouse position
                Point mouseLocation = MouseInfo.getPointerInfo().getLocation();
                int x = mouseLocation.x;
                int y = mouseLocation.y;

                // Move the mouse slightly
                robot.mouseMove(x + 1, y); 
                Thread.sleep(500);   // Wait for 0.5 seconds
                robot.mouseMove(x, y);  

                // Wait for 19.5 seconds before the next move
                Thread.sleep(19500);
            }
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
