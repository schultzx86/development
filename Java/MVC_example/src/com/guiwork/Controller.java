package com.guiwork;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Steven on 9/11/16.
 */
public class Controller {

    private Model model;
    private View view;
    private ActionListener actionListenerInc;
    private ActionListener actionListenerDec;
    private ActionListener actionListenerReset;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

    }

    public void control() {
        actionListenerInc = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                linkIncBtnAndLabel();

            }
        };
        actionListenerDec = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                linkDecBtnAndLabel();

            }
        };
        actionListenerReset = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                linkResetBtnAndLabel();
            }
        };
        view.getButtonInc().addActionListener(actionListenerInc);
        view.getButtonDec().addActionListener(actionListenerDec);
        view.getButtonReset().addActionListener(actionListenerReset);
    }

    private void linkIncBtnAndLabel() {
        model.incX();
        view.setText(Integer.toString(model.getX()));
    }

    private void linkDecBtnAndLabel() {
        model.decX();
        view.setText(Integer.toString(model.getX()));
    }

    private void linkResetBtnAndLabel() {
        model.resetX();
        view.setText(Integer.toString(model.getX()));
    }
}
