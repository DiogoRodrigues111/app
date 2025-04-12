package com.example.app.app.jpa;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

@Service
public class UserServiceRepository implements IUserRepository{

	private IUserRepository iUserRepository;
	
    public UserServiceRepository() { }
   

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends UserRepositoryEntity> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends UserRepositoryEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<UserRepositoryEntity> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserRepositoryEntity getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserRepositoryEntity getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserRepositoryEntity getReferenceById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends UserRepositoryEntity> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends UserRepositoryEntity> S save(S entity) {
		// TODO Auto-generated method stub
		if (entity == null)
			throw new RuntimeException("Entity can't be null");
		
		iUserRepository.save(entity);
		return entity;
	}

	@Override
	public Optional<UserRepositoryEntity> findById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(UserRepositoryEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends UserRepositoryEntity> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<UserRepositoryEntity> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<UserRepositoryEntity> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends UserRepositoryEntity> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends UserRepositoryEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends UserRepositoryEntity> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends UserRepositoryEntity> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends UserRepositoryEntity, R> R findBy(Example<S> example,
			Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends UserRepositoryEntity> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends UserRepositoryEntity> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<UserRepositoryEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<UserRepositoryEntity> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}
}
