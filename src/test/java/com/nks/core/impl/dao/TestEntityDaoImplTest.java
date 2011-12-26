package com.nks.core.impl.dao;

import static org.junit.Assert.assertNotNull;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import com.nks.core.api.dao.TestEntityDao;
import com.nks.core.domain.TestEntity;

@ContextConfiguration(locations = {"classpath:CoreContext-Test.xml"})
public class TestEntityDaoImplTest extends AbstractTransactionalJUnit4SpringContextTests {
	
	@Resource
	private TestEntityDao testEntityDao;
	
	@Test
	public void testPersist() {
		TestEntity testEntity = new TestEntity();
		testEntityDao.persist(testEntity);
		assertNotNull(testEntity.getId());
	}

}
