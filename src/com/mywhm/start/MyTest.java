package com.mywhm.start;

import com.sun.xml.internal.ws.addressing.EPRSDDocumentFilter;

import java.util.ArrayList;
import java.util.Date;

public class MyTest {
    public static void main(String[] args) {

        System.out.println("Hello world!!");
        Date date = new Date();
        short d=1;
        String[] names = new String[]{"aaa","bbb","ccc","ddd"};
        for (String name : names) {
            System.out.println("name = " + name);
        }
        ArrayList list3= new ArrayList();
        list3.add(1);
        for (Object o : list3) {
            System.out.println("o = " + o);

        }
        if (list3 == null) {

        }
        if (list3 != null) {

        }


    }
}
