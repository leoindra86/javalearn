package gui_projects;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui implements ActionListener
{
        private static JLabel userLabel;
        private static JTextField userText;
        private static JLabel passwordLabel;
        private static JPasswordField passwordText;
        private static JButton button;
        private static JLabel success;

        public static void main(String[] args)
        {
                JFrame frame = new JFrame();
                JPanel panel = new JPanel();
                frame.setSize(600, 600);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                frame.add(panel);

                panel.setLayout(null);

                userLabel = new JLabel("User");//user label
                userLabel.setBounds(10, 20, 80, 25);
                panel.add(userLabel);

                userText = new JTextField();//user text
                userText.setBounds(100, 20, 165, 25);
                panel.add(userText);

                passwordLabel = new JLabel("Password");//password label
                passwordLabel.setBounds(10, 50, 80, 25);
                panel.add(passwordLabel);

                passwordText = new JPasswordField();//user text
                passwordText.setBounds(100, 50, 165, 25);
                panel.add(passwordText);

                button = new JButton("Login");
                button.setBounds(10, 80, 80, 25);
                button.addActionListener(new Gui());
                panel.add(button);


                success = new JLabel("");
                success.setBounds(10, 110, 300, 25);
                panel.add(success);

                frame.setVisible(true);


        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
                String pass = "test";
                //System.out.println("Button Clicked");
                String user = userText.getText();
                String password = passwordText.getText();
                //System.out.println(user + "," + password);

                if (user.equals("test") && password.equals(pass))
                {
                        success.setText("Login Success");
                }
                else
                {
                        success.setText("incorrect password");
                }
        }
}
