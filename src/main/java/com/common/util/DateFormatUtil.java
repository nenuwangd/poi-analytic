package com.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatUtil {

	public static String formatDate(Date date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy_MM_dd");
		return format.format(date);
	}

}
