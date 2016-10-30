import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FirstWindow extends JFrame {
    private int count = 0;
    private JTextField fullName;
    private JLabel mark;
    private JLabel mark2;
    private JLabel mark3;
    private JButton button;
    private JButton button2;
    private String s;

     private FirstWindow (String title)
    {
        super(title);
        super.setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        fullName = new JTextField(20);

        mark = new JLabel("Ваше имя?");
        mark2 = new JLabel();
        mark3 = new JLabel();
        mark3.setVisible(false);
        button = new JButton(" Нажми меня! ");
        button2 = new JButton(" магия ");

        button.setBounds(65,60,150,40);
        button2.setBounds(65,110,150,40);
        mark.setBounds(15,15,95,30);
        mark2.setBounds(15,150,180,30);
        mark3.setBounds(65,60,150,40);
        fullName.setBounds(120, 15, 100, 30);

        createWindow();
        initListeners();
        super.setVisible(true);
    }

    private void createWindow(){
        getContentPane().setLayout(null);
        getContentPane().add(button);
        getContentPane().add(button2);
        getContentPane().add(mark);
        getContentPane().add(mark2);
        getContentPane().add(mark3);
        getContentPane().add(fullName);
        setLocationRelativeTo(null);
    }
    private void initListeners () {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                if (fullName.getText().equals(""))
                    mark2.setText("Спасибо тебе!");
                else mark2.setText("Спасибо, "+fullName.getText()+"!");
                button.setText("Нажато " + count + " раз");

            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                button.setVisible(false);
                mark3.setText("Нажато " + count + " раз");
                mark3.setVisible(true);
                FirstWindow.super.setSize(500,500);
            }
        });
    }
    public static void main(String[] args) {
        FirstWindow mainFrame = new FirstWindow("Лабораторная работа № 4 , выполнил Серегин Сергей!");
    }
}