package com.greenfox.splichus.services;

import com.greenfox.splichus.models.MyColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Orange implements MyColor {

    Printer printer;

    @Autowired
    public Orange(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void printColor() {
        printer.log("It is orange in color...");
    }
}
