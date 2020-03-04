package com.testeador.utils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class Validacion {

	public  boolean isEmpty(Object value) {
		boolean empty = true;
		if (value != null) {
			if (value instanceof String || value instanceof Date) {
				empty = isBlankOrNull(value.toString()) || value.toString() == "-1";
			} else if (value instanceof Double || value instanceof BigDecimal) {
				empty = (Double.parseDouble(value.toString()) == 0.0)
						|| (new BigDecimal(value.toString()) == BigDecimal.ZERO);
			} else if (value instanceof Integer || value instanceof Long) {
				empty = (Integer.parseInt(value.toString()) == 0) || (Long.parseLong(value.toString()) == 0);
			} else if (value instanceof ArrayList || value instanceof List ) {
				empty = ((ArrayList<?>) value).size() == 0 || ((List<?>) value).size() == 0
						 ;
			}else if (value instanceof Map) {
				empty = ((Map<?, ?>) value).size() == 0;
			}
		}
		return empty;

	}
	
	public  boolean isBlankOrNull(String value) {
        return ((value == null) || (value.trim().length() == 0));
    }

}
