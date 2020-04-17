package com.ssm.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToString implements Converter<Date, String> {

    @Override
    public String convert(Date source) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            System.out.println(dateFormat.format(source));
            return dateFormat.format(source);
//            return dateFormat.parse(source);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
