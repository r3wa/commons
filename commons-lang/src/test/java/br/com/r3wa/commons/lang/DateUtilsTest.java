package br.com.r3wa.commons.lang;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import br.com.r3wa.commons.lang.DateUtils;

public class DateUtilsTest {



	@Test
	public void shouldSetHourOfDateToMindNight() {

	  Date date = DateUtils.fisrtHourDay(new Date());

	  Calendar calendar = Calendar.getInstance();
	  calendar.setTime(date);

	  assertThat(calendar.get(Calendar.HOUR_OF_DAY), equalTo(0));
	  assertThat(calendar.get(Calendar.MINUTE), equalTo(0));
	  assertThat(calendar.get(Calendar.SECOND), equalTo(0));
	  assertThat(calendar.get(Calendar.MILLISECOND), equalTo(0));
	}


	@Test
	public void shouldSetHourOfDateToLastTime() {
		Date date = DateUtils.lastHourDay(new Date());
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);

		assertThat(calendar.get(Calendar.HOUR_OF_DAY), equalTo(23));
		assertThat(calendar.get(Calendar.MINUTE), equalTo(59));
		assertThat(calendar.get(Calendar.SECOND), equalTo(59));
		assertThat(calendar.get(Calendar.MILLISECOND), equalTo(0));
	}

}
