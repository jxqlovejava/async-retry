package com.blogspot.nurkiewicz.asyncretry;

import java.math.BigDecimal;

/**
 * @author Tomasz Nurkiewicz
 * @since 7/17/13, 7:09 PM
 */
public interface FaultyService {

	int alwaysSucceeds();

	String sometimesFails();

	BigDecimal calculateSum(int retry);

	void withFlag(boolean flag);

}
