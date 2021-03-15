package com.williams.kailyn.learningjpa.dao;

import com.williams.kailyn.learningjpa.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class UserDaoService {

    @PersistenceContext
    private EntityManager entityManager;

    public User insert(User user){
        entityManager.persist(user);
        return user;
    }

}
