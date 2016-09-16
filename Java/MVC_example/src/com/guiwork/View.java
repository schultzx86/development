package com.guiwork;

import oracle.jvm.hotspot.jfr.JFR;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.BorderLayout;


/**
 * Created by Steven on 9/11/16.
 */
public class View {
    private JFrame frame;
    private JLabel label;
    private JButton buttonInc, buttonDec, buttonReset;

    public View(String text) {
        frame = new JFrame("View");
        frame.getContentPane().setLayout(new BorderLayout());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setVisible(true);

        label = new JLabel(text);
        frame.getContentPane().add(label, BorderLayout.CENTER);

        buttonInc = new JButton("Increment");
        frame.getContentPane().add(buttonInc, BorderLayout.NORTH);

        buttonDec = new JButton("Decrement");
        frame.getContentPane().add(buttonDec, BorderLayout.SOUTH);

        buttonReset = new JButton("Reset");
        frame.getContentPane().add(buttonReset, BorderLayout.EAST);
    }

    public JButton getButtonInc() {
        return buttonInc;
    }

    public JButton getButtonDec() {
        return buttonDec;
    }

    public JButton getButtonReset() {
        return buttonReset;
    }

    public void setText(String text) {
        label.setText(text);
        label.setHorizontalAlignment(SwingConstants.CENTER);
    }
}
