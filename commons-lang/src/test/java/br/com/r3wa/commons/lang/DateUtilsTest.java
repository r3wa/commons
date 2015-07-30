package br.com.r3wa.commons.lang;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

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



	@Test
	public void shouldReturnOneDateWhenThePatterIsValid() {

		Date date = DateUtils.toDate("1976-10-01", "yyyy-MM-dd");

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);

		assertThat(calendar.get(Calendar.YEAR), equalTo(1976));
		assertThat(calendar.get(Calendar.MONTH), equalTo(9));
		assertThat(calendar.get(Calendar.DAY_OF_MONTH), equalTo(1));

	}




	@Test(expected=R3WACommonsLangException.class)
	public void shouldTrhowOneR3WACommonsLangExceptionWhenThePatternIsInvalid() {
		DateUtils.toDate("1976-10-01", "invalid pattern");
	}




}
