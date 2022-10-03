package com.repository.jparepository;

import com.model.User;
import com.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;

import java.util.List;

public class UserJpaRepository {

    private final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public List<User> getAll() {
        Session session = sessionFactory.openSession();

        NativeQuery<User> nativeQuery = session.createNativeQuery("select * from users", User.class);
        return nativeQuery.getResultList();

    }
}
