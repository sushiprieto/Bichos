import org.hibernate.HibernateException;
import org.hibernate.Metamodel;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.metamodel.EntityType;

import java.util.Map;

/**
 * Created by Carlos Prieto on 09/02/2017.
 */
public class Main {

    public static void main(final String[] args) throws Exception {

        MySessionFactory sessionFactory = new MySessionFactory();

    }
}