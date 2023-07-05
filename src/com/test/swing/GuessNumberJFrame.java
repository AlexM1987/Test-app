package com.test.swing;

import com.test.MathUtil;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class GuessNumberJFrame extends JFrame {
    private int x = 0;
    private int attempts;

    public GuessNumberJFrame(){
        setTitle("Guess Number Game");
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 400);

        // SET Frame size


        // add 'from', 'to' JTextField

        JLabel lbl1 = new JLabel("From");
        JTextField field1 = new JTextField("0");
        lbl1.setBounds(50, 50, 200, 20);
        field1.setBounds(50,80, 100, 20);
        add(lbl1);
        add(field1);

        JLabel lbl2 = new JLabel("To");
        JTextField field2 = new JTextField("10");
        lbl2.setBounds(150, 50, 200, 20);
        field2.setBounds(150,80, 100, 20);
        add(lbl2);
        add(field2);

        JLabel lbl3 = new JLabel("Attempts");
        JTextField field3 = new JTextField("3");
        lbl3.setBounds(250, 50, 200, 20);
        field3.setBounds(250,80, 100, 20);
        add(lbl3);
        add(field3);

        JButton button=new JButton();
        button.setText("Generate");
        button.setSize(250,40);
        add(button);
        button.setLocation(40,300);

        JLabel msg = new JLabel("");
        msg.setBounds(30, 125, 320, 20);
        add(msg);

        JButton guessButton=new JButton();
        guessButton.setText("GO!");
        guessButton.setSize(250,40);
        add(guessButton);
        guessButton.setLocation(340,300);
        guessButton.setVisible(false);

        JTextField answerField = new JTextField("0");
        answerField.setBounds(315, 200, 120, 20);
        answerField.setVisible(false);
        add(answerField);

        JButton restart = new JButton();
        restart.setText("Play again");
        restart.setSize(250,40);
        add(restart);
        restart.setLocation(140,400);
        restart.setVisible(false);



        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int from = Integer.parseInt(field1.getText()); // "20" -> 20
                int to = Integer.parseInt(field2.getText()); // "20" -> 20
                attempts = Integer.parseInt(field3.getText()); // "20" -> 20
                x = MathUtil.genRandom(from, to);

                field1.setEnabled(false);
                field2.setEnabled(false);
                field3.setEnabled(false);
                button.setVisible(false);

                msg.setText("The random number has been generated. Try to guess.");
                guessButton.setVisible(true);
                answerField.setVisible(true);
            }
        });

guessButton.addActionListener(new AbstractAction() {
    @Override
    public void actionPerformed(ActionEvent e) {
//        if(attempts > 0){
//
//            attempts--;
//        }
        if(attempts > 0){
            int userX = Integer.parseInt(answerField.getText());
            if (x == userX){
                msg.setText("You WON!");
                guessButton.setVisible(false);
                answerField.setEnabled(false);
                restart.setVisible(true);
            }else {
                if(attempts == 1){
                    guessButton.setVisible(false);
                    answerField.setEnabled(false);
                    restart.setVisible(true);
                    msg.setText("You LOST!");
                }else {
                    msg.setText(" Your number is " + (userX > x ? "greater " : "less ")); // тернарный оператор
                }
            }
        }

        attempts--;
        field3.setText(attempts + "");
    }
});

restart.addActionListener(new AbstractAction() {
    @Override
    public void actionPerformed(ActionEvent e) {
        field1.setEditable(true);
        field1.setText("0");
        field2.setEditable(true);
        field2.setText("10");
        field3.setEditable(true);
        field3.setText("3");
        button.setVisible(true);

        restart.setVisible(false);

        msg.setText("");
        answerField.setVisible(false);
        answerField.setEditable(true);

        guessButton.setVisible(false);
        guessButton.setEnabled(true);

    }
});

        setVisible(true);
    }


}

class Player{
    public static void main(String[] args) {
        GuessNumberJFrame game = new GuessNumberJFrame();
    }
}
