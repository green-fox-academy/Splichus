package com.greenfox.splichus.services;

import com.greenfox.splichus.models.MyColor;
import org.springframework.beans.factory.annotation.Autowired;

public class Blue implements MyColor {

    Printer printer;

    @Autowired
    public Blue(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void printColor() {
        printer.log("It is blue in color...");
    }
}
