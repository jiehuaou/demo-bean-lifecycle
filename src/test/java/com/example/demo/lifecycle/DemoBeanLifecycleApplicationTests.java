package com.example.demo.lifecycle;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoBeanLifecycleApplicationTests {

//	@Autowired
//	public MySpringBean mySpringBean;

	@Autowired
	User u ;

//	@Autowired
//	public MySecondBean secondBean;

	@Test
	public void testMySpringBeanLifecycle() {
		String message = "Hello World";
		u.getMyBean().sendMessage(message);
//		mySpringBean.sendMessage(message);
		System.out.println(u.getMyBean().getMessage());
		u.clean();
//		System.out.println(secondBean);
//		assert(mySpringBean.getMessage()).isEqualTo(message);
	}

}
