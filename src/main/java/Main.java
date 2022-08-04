import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class Main {
    public static void main(String args[]){
        EntityManager manager= JPAConfiguration.createJpaConfiguration();
        Employee emp=new Employee();
        Department dept=new Department();
        emp.setEmpid(101);
        emp.setEmpname("bharath");
        emp.setSalary(10000);
        emp.setDesign("hr");
        dept.setDeptId(1001);
        dept.setDeptName("HrDept");
        dept.setEmployee(emp);
        EntityTransaction ent=manager.getTransaction();
        ent.begin();
        manager.persist(emp);
        manager.persist(dept);
        ent.commit();
    }
}
