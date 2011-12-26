package com.nks.core.impl.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;
import org.springframework.transaction.annotation.Transactional;

import com.nks.core.api.dao.GenericDao;

@Transactional
public class GenericDaoJpaImpl<K, E> implements GenericDao<K, E> {

	protected Class<E> entityClass;

	@PersistenceContext
	protected EntityManager entityManager;
	
	protected Logger logger;

	@SuppressWarnings("unchecked")
	public GenericDaoJpaImpl() {
		ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
		this.entityClass = (Class<E>) genericSuperclass.getActualTypeArguments()[1];
		logger = Logger.getLogger(this.getClass());
	}

	
	@Override
	public void remove(E entity) {
		logger.info("Request received for remove");
		entityManager.remove(entity);

	}

	@Override
	public E findById(K id) {
		logger.info("Request received for find");
		return entityManager.find(entityClass, id);
	}
	
	public E merge(E entity) {
		logger.info("Request received for merge");
		return entityManager.merge(entity);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<E> findAll() { 
		logger.info("Request received for findALl");
		return entityManager.createQuery("Select e From " + entityClass.getCanonicalName() + " e").getResultList();
	}
	
	protected EntityManager getEntityManager() {
		return entityManager;
	}

	@Override
	public void persist(E entity) {
		logger.info("Request received for persist");
		entityManager.persist(entity);
	}
}