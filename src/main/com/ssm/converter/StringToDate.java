package com.ssm.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate implements Converter<String, Date> {
        @Override
        public Date convert(String source) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            try {
//                System.out.println(dateFormat.format(source));
//                return dateFormat.format(source);
            return dateFormat.parse(source);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
}
