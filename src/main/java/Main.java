import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
		Employee e1 = (Employee) context.getBean("emp1");
		Employee e2 = context.getBean("emp2", Employee.class);
		System.out.println(e1 + " " + e2);
		Resource resource = new ClassPathResource("employeebean.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		e1 = (Employee) factory.getBean("emp1");
		e2 = factory.getBean("emp2", Employee.class);
		System.out.println(e1 + " " + e2);
	}
}
