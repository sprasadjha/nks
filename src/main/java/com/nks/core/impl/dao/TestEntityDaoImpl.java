package com.nks.core.impl.dao;

import org.springframework.stereotype.Repository;

import com.nks.core.api.dao.TestEntityDao;
import com.nks.core.domain.TestEntity;

@Repository("testEntityDao")
public class TestEntityDaoImpl extends GenericDaoJpaImpl<Long, TestEntity> implements TestEntityDao{

}
