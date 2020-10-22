package com.aug.dao.impl;

import org.hibernate.SessionFactory;

import com.aug.dao.TestDAO;

public class TestDAOImpl implements TestDAO {
	
	SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return this.sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

}
