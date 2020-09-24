package com.stumpner.myss;

import com.stumpner.myss.web.StartpageController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * For more on Testing with Spring see https://spring.io/guides/gs/testing-web/
 */
@SpringBootTest
class MyApplicationTests {

	@Autowired
	private StartpageController controller;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}
