package cl.exam.exam;

import cl.exam.exam.helper.Helper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ExamApplicationTests {

	@Autowired
	Helper helper;
	@Test
	void contextLoads() {
		helper.metodoHelper("");
	}

}
