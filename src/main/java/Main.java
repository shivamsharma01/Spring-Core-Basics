import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.shivam04111992.CustomerService;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
		Employee e1 = (Employee) context.getBean("emp1");
		Employee e2 = context.getBean("emp2", Employee.class);
		System.out.println(e1 + " " + e2);

		Resource resource = new ClassPathResource("customer.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		CustomerService customerService = factory.getBean("customerServiceProxy", CustomerService.class);

		System.out.println("**********************");
		customerService.printName();
		System.out.println("**********************");
		customerService.printURL();
		System.out.println("**********************");
		try {
			customerService.printThrowException();
		} catch (Exception e) {

		}
	}
}
