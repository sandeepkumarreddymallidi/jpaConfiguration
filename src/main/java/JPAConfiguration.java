import org.datanucleus.metadata.PersistenceUnitMetaData;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

public class JPAConfiguration {
    PersistenceUnitMetaData pumd = new PersistenceUnitMetaData("dynamic-unit", "RESOURCE_LOCAL", null);
    pumd.

    EntityManagerFactory emf = new JPAEntityManagerFactory(pumd, null);
  /* public static EntityManager result=null;

    public static EntityManager createJpaConfiguration()
    {
        Map<String, String> properties = new HashMap<String, String>();
        properties.put("javax.persistence.jdbc.driver", "org.postgresql.Driver") ;
        properties.put("javax.persistence.jdbc.user","postgres") ;
        properties.put("javax.persistence.jdbc.password","root");
        properties.put("javax.persistence.jdbc.url", "jdbc:postgresql://localhost/postgres");
        properties.put("hibernate.dialect","org.hibernate.dialect.PostgreSQL81Dialect");
        properties.put("hibernate.hbm2ddl.auto","create");
        properties.put("hibernate.show_sql","true");
        EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("conn1",properties);
        EntityManager en

        return result;

    }*/
}
