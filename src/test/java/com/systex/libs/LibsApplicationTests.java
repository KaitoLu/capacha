package com.systex.libs;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LibsApplicationTests {

	@Test
	void contextLoads() {
		System.out.println(captcha.generateCaptcha());
		System.out.println(captcha.generateCaptcha());
	}

}
