package com.guiwork;

import oracle.jvm.hotspot.jfr.JFR;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.KeyStroke;


/**
 * Created by Steven on 9/11/16.
 */
public class View {
    private JFrame frame;
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem menuItem0;
    private JLabel label;
    private JButton buttonInc, buttonDec, buttonReset;

    public View(String text) {
        frame = new JFrame("View");
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setVisible(true);

        //Build the first menu
        menuBar = new JMenuBar();
        menu = new JMenu("A Menu");
        menu.setMnemonic(KeyEvent.VK_A);
        menu.getAccessibleContext().setAccessibleDescription("Here is a placeholder.");
        menuBar.add(menu);

        //A group of JMenuItems
        menuItem0 = new JMenuItem("A text-only menu item", KeyEvent.VK_T);
        menuItem0.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem0.getAccessibleContext().setAccessibleDescription("Doesn't do anything, yet.");
        menu.add(menuItem0);

        frame.setJMenuBar(menuBar);

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
