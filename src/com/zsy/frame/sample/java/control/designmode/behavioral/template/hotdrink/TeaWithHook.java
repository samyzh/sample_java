package com.zsy.frame.sample.java.control.designmode.behavioral.template.hotdrink;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: samy(hongfeiliuxing@gmail.com)
 * @datetime: 2015-08-07 19:57
 */
public class TeaWithHook extends HotDrinkTemplate {
    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }

    @Override
    protected void brew() {
        System.out.println("Brewing tea");
    }

    @Override
    protected boolean wantCondimentsHook() {
//        return super.wantCondimentsHook();
        System.out.println("Codiments, yes or no ? please inpout(y/n):");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String result = "";
        try {
            result = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (result.equals("n")){
            return false;
        }else {
            return true;
        }

    }
}
