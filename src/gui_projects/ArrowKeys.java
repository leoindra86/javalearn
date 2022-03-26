package gui_projects;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ArrowKeys {

        public ArrowKeys() {
                JFrame frame = new JFrame();
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(400, 400); //size of frame in pixels
                frame.setFocusable(true); //clickable

                JPanel panel = new JPanel();
                JLabel up = new JLabel();
                JLabel down = new JLabel();
                JLabel left = new JLabel();
                JLabel right = new JLabel();

                panel.add(up);
                panel.add(down);
                panel.add(right);
                panel.add(left);

                up.setText("Up: 0");
                down.setText("Down: 0");
                right.setText("Right: 0");
                left.setText("Left: 0");

                frame.addKeyListener(new KeyListener()
                {
                        int upCount = 0;
                        int downCount = 0;
                        int rightCount = 0;
                        int leftCount = 0;

                        @Override public void keyTyped(KeyEvent e) {
                        }

                        @Override public void keyPressed(KeyEvent e) { //keyboard typed (left,up) passes to e
                                int keyCode = e.getKeyCode();
                                switch (keyCode)
                                {
                                        case KeyEvent.VK_UP -> //VK_UP is key up
                                                up.setText("Up Key: " + upCount++);
                                        case KeyEvent.VK_DOWN -> //VK_UP is key up
                                                down.setText("Down Key: " + downCount++);
                                        case KeyEvent.VK_RIGHT -> //VK_UP is key up
                                                right.setText("Right Key: " + rightCount++);
                                        case KeyEvent.VK_LEFT -> //VK_UP is key up
                                                left.setText("Left Key: " + leftCount++);
                                }
                        }

                        @Override public void keyReleased(KeyEvent e) {

                        }
                });

                frame.add(panel);
        }

        public static void main(String[] args) {
                new ArrowKeys();
        }
}
