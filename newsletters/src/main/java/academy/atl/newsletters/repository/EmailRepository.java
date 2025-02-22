package academy.atl.newsletters.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EmailRepository {

    @PersistenceContext
    EntityManager database;


    @Transactional
    public void saveEmail(String email) {
        String sqlquery = "INSERT INTO `lead` (`email`) VALUES (:email)";
        database.createNativeQuery(sqlquery)
                .setParameter("email", email)
                .executeUpdate();
    }

    @Transactional

    public void deleteEmail(String email) {
        String sqlquery = "DELETE FROM `lead` WHERE `email` = :email";
        database.createNativeQuery(sqlquery)
                .setParameter("email", email)
                .executeUpdate();
    }


    @Transactional
    public List<String> getEmails() {
        String sqlquery = "SELECT email FROM lead";
        Query query = database.createNativeQuery(sqlquery);
        return query.getResultList();

    }


}
