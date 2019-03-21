package com.edge.starringharsh.EDGE.utils;

import android.util.Log;

import com.edge.starringharsh.EDGE.model.ContactsModel;

import java.util.ArrayList;
import java.util.List;

public class FormatUtils {
    public static String numToStr(int n) {
        switch(n % 10) {
            case 1:
                return n + "st";
            case 2:
                return n + "nd";
            case 3:
                return n + "rd";
            default:
                return n + "th";
        }
    }

    public static List<ContactsModel> splitContacts(String nameCsv, String numberCsv) {
        List <ContactsModel> contacts = new ArrayList<>(4);

        String [] names = nameCsv.split(",");
        String [] numbers = numberCsv.split(",");

        if (names.length != numbers.length)
            Log.i("EventDetails", "splitContacts: Number of names and contact numbers are different");

        for (int i = 0; i < Math.min(names.length, numbers.length); i++) {
            if (! "".equals(names[i]) && ! "".equals(numbers[i]))
                contacts.add(new ContactsModel(names[i], numbers[i]));
        }
        return contacts;
    }
}
