package com.nks.core.api.dao;

import java.util.List;

public interface GenericDao<K, E> {

	/**
	 * Persists Entity
	 * 
	 * @param entity
	 */
	public void persist(E entity);

	/**
	 * removes entity
	 * 
	 * @param entity
	 */
	public void remove(E entity);

	/**
	 * finds entity by id
	 * 
	 * @param id
	 * @return
	 */
	public E findById(K id);
	
	/**
	 * finds all entities
	 * @return
	 */
	public List<E> findAll();
	
	/**
	 * merges the Entity
	 * @param entity
	 * @return
	 */
	public E merge(E entity);
}