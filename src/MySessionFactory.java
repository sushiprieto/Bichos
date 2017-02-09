import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by Carlos Prieto on 09/02/2017.
 */
public class MySessionFactory {

    private SessionFactory ourSessionFactory;

    public MySessionFactory(){
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            ourSessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

    public void closeSession(){
        try{
            ourSessionFactory.close();

        }catch (HibernateException e){
            e.printStackTrace();
        }
    }

}
