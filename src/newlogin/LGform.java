package newlogin;
import javax.swing.*;


import regisration.RegisrationForm;

import java.awt.*;
import java.awt.event.*;

public class LGform extends JFrame implements ActionListener {

    private JLabel usernameLabel,passwordJLabel,logheadJLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton,btnDK;

    public LGform() {

        logheadJLabel = new JLabel("Đăng nhập");
        logheadJLabel.setBounds(110, 0, 250, 70);
        logheadJLabel.setFont(new Font(null,0,48));

        usernameLabel = new JLabel("Tên đăng nhập : ");
        usernameLabel.setBounds(20, 50, 200, 70);
        usernameLabel.setFont(new Font(null, 0, 20));
        usernameField = new JTextField();
        usernameField.setBounds(200, 78, 200, 20);

        passwordJLabel = new JLabel("Mật khẩu : ");
        passwordJLabel.setBounds(20, 100, 200, 70);
        passwordJLabel.setFont(new Font(null, 0, 20));
        passwordField = new JPasswordField();
        passwordField.setBounds(200, 128, 200,20);

        loginButton = new JButton("Đăng nhập");
        loginButton.setBounds(220, 170, 95, 20);
        loginButton.addActionListener(this);

        
        btnDK = new JButton("Đăng ký");
        btnDK.setBounds(320, 170, 95, 20);
        btnDK.addActionListener(this);

        setLayout(null);
        add(logheadJLabel);
        add(usernameLabel);
        add(usernameField);
        add(passwordJLabel);
        add(passwordField);
        add(loginButton);
        add(btnDK);

        setSize(450, 250);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnDK) {
            dispose();
            new RegisrationForm();
            return;
        } if (e.getSource() == loginButton ) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            if (LoginService.authenticate(username, password)) {
                JOptionPane.showMessageDialog(LGform.this, "Đăng nhập thành công !","Thông báo",JOptionPane.INFORMATION_MESSAGE);
                dispose();

            } else {
                JOptionPane.showMessageDialog(LGform.this, "Tài khoản hoặc mật khẩu không đúng !","Thông báo",JOptionPane.ERROR_MESSAGE);
            }
        }
    }

   
}