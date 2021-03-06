package com.dlh.clpgx.freamwork.repository;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
public class MyDcoreJpaRepository<T, ID extends Serializable>
extends SimpleJpaRepository<T, ID> implements DcoreJpaRepository<T, ID>{
	Logger logger = LoggerFactory.getLogger(MyDcoreJpaRepository.class);
	private final EntityManager em;  
	public MyDcoreJpaRepository(Class<T> domainClass, EntityManager em) {
		super(domainClass, em);
		this.em=em;
	}
	
	
	
	public MyDcoreJpaRepository(final JpaEntityInformation<T, ?> entityInformation, final EntityManager em) {
		  super(entityInformation, em);  
		  this.em = em;  
	}

}
