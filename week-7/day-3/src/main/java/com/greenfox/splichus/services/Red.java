package com.greenfox.splichus.services;

import com.greenfox.splichus.models.MyColor;
import org.springframework.beans.factory.annotation.Autowired;


public class Red implements MyColor {

    Printer printer;

    @Autowired
    public Red(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void printColor() {
        printer.log("It is red in color...");
    }
}
