package com.Spring.API.Spring.Assignment.with.One.Controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringAssignmentWithOneControllerApplicationTests {

	@Test
	public void testGetCurrentTime () throws Exception {
		Controller.showStatus();
	}

}
