package com.chuck;


import com.chuck.service.MusicalInstrument;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) throws SQLException {
        System.out.println("Java SPI");

        // 获取具体实现类对象集合
        ServiceLoader<MusicalInstrument> serviceLoader = ServiceLoader.load(MusicalInstrument.class);

        // 遍历调用play方法
        for (MusicalInstrument service : serviceLoader) {
            service.play();
        }

        DriverManager.getDriver("jdbc:mysql://localhost:3306/test");
    }
}
