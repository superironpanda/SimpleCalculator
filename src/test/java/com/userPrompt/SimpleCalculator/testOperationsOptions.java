package com.userPrompt.SimpleCalculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testOperationsOptions {

	@Test
	void test() {
		OperationOptions op = new OperationOptions();
		String[] availableOptions= {"Add", "Subtract", "Multiply", "Divide", "Modulus", "Quit"};
		assertArrayEquals(availableOptions, op.availableOptions);
	}

}
