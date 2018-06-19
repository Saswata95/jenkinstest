package hibassign1;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		Session session = Hibernateutil.getSessionFactory().openSession();

		session.beginTransaction();
		User user = new User();

		user.setId(1);
		user.setName("Saswata");
		
		session.save(user);
		session.getTransaction().commit();
	}

}
