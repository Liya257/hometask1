package com.company;

import javax.swing.*;

public class Cycle{
    private static Logic logic = new Logic();
    private static Frame frame = new Frame(logic.getSide());

    private static void action(String text){
        JOptionPane.showMessageDialog(null,text);
    }

    private static boolean result(String result){
        if(result=="X")        { action("YUO LOSE"); return true; }
        if(result=="0")        { action("YUO WON");  return true;}
        if(result=="deadlock") { action("DRAW");     return true;}
        return false;
    }

    public static void main(String[] args) {
        while(true){
            frame.pushReset();
            frame.update(logic.resetPosition());
            while(true){
                frame.update(logic.process(frame.pushButton()));
                if(result(logic.result())){ break; }
            }
        }
    }

}