package controllers;

import java.util.HashSet;
import java.util.Set;

import entity.DegreeOfLector;
import entity.Department;
import entity.Lector;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtil;

public class UniversityController {

        public static void HumanResourceDepartment(){

                Session session = HibernateSessionFactoryUtil.getSessionFactory().getCurrentSession();
                session.getTransaction().begin();

                Set<Lector> lectors1 = new HashSet<>();
                Set<Lector> lectors2 = new HashSet<>();
                Set<Lector> lectors3 = new HashSet<>();
                Set<Lector> lectors4 = new HashSet<>();
                Set<Lector> lectors5 = new HashSet<>();

                Department department1 = new Department("PhysicsDepartment", "Natalia");
                Department department2 = new Department("MathematicsDepartment","Alex");
                Department department3 = new Department("HistoryDepartment","Ross");
                Department department4 = new Department("ArchitectureDepartment","SteveRogers");
                Department department5 = new Department("EnglishLanguageDepartment","Mike");

                lectors1.add(new Lector("Leonardo", 3600, DegreeOfLector.ROLE_PROFESSOR));
                lectors2.add(new Lector("Donatello", 1800, DegreeOfLector.ROLE_ASSISTANT));
                lectors3.add(new Lector("Rafael", 3200, DegreeOfLector.ROLE_PROFESSOR));
                lectors4.add(new Lector("Tony", 4500, DegreeOfLector.ROLE_ASSOCIATE_PROFESSOR));
                lectors5.add(new Lector("JekSparrow", 1200, DegreeOfLector.ROLE_ASSISTANT));

                department1.setLectors(lectors1);
                department2.setLectors(lectors2);
                department3.setLectors(lectors3);
                department4.setLectors(lectors4);
                department5.setLectors(lectors5);

                session.persist(department1);
                session.persist(department2);
                session.persist(department3);
                session.persist(department4);
                session.persist(department5);

                session.getTransaction().commit();
        }
}
