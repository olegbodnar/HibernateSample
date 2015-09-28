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



    public static Integer createFamily(Family family){
    Session session = factory.openSession();
        Transaction transaction = null;
        Integer familyID = null;
        try {
            transaction = session.beginTransaction();
            familyID = (Integer) session.save(family);
            transaction.commit();
        }catch (HibernateException ex){
            if (transaction != null){
                transaction.rollback();
                ex.printStackTrace();
            }
        }finally {
            session.close();
        }
        return familyID;
    }
}
