package repo;


import entity.Family;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class FamilyRepo {
    private static SessionFactory factory;

    public static SessionFactory getFactory() {
        return factory;
    }

    public static void setFactory(SessionFactory factory) {
        FamilyRepo.factory = factory;
    }

// method is used to add an Family

    public static Integer addFamily (Family family){
        Session session = factory.openSession();
        Transaction tx = null;
        Integer familyId= null;
        try {
            tx = session.beginTransaction();
            familyId = (Integer) session.save(family);
            tx.commit();
        } catch (HibernateException he){
            if(tx != null){
                tx.rollback();
            }
            System.out.println(he.getMessage());
        }
        session.close();
        return familyId;
    }
}
