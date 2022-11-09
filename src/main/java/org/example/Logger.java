package org.example;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private int num = 1;
    private static Logger instance = null; //для хранения инстанса
    private SimpleDateFormat formater = new SimpleDateFormat("dd.MM.yyyy h:mm:ss");
    private Date date = new Date();


    public void log(String msg) {
        System.out.println("[" + formater.format(date) + " " + num++ + "] " + " " + msg);
    }


    private Logger() {}//Конструктор


    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

}
