import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.UserService;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/config/user.xml");
		
		UserService s1 = ctx.getBean("service" , UserService.class);
		List<String> list =s1.list();
		System.out.println(list);
	}
}
