package com.sendError.SimpleCalculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testSendError {

	@Test
	void test() {
		SendError testSendError = new SendError();
		testSendError.wrongTypeOfInput();
	}

}
