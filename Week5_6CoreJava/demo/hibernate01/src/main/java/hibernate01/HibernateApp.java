package hibernate01;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.mastek.model.Employee;

public class HibernateApp {

	public static void main(String[] args) {
		Employee emp = new Employee("Amit", "Jha");
		try {
			StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml")
					.build();
			Metadata meta = new MetadataSources(registry).getMetadataBuilder().build();
			SessionFactory factory = meta.getSessionFactoryBuilder().build();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(emp);
			transaction.commit();
			System.out.println(emp+ " Saved Successfully!");
			session.close();
			factory.close();

		} catch (Exception e) {

			e.printStackTrace();
		}

	}
}
