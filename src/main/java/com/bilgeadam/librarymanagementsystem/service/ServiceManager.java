package com.bilgeadam.librarymanagementsystem.service;

import com.bilgeadam.librarymanagementsystem.repository.entity.State;
import com.bilgeadam.librarymanagementsystem.repository.entity.StateInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public class ServiceManager<T extends StateInfo,ID> implements IServices<T,ID> {

    private final JpaRepository<T,ID> service;

    public ServiceManager(JpaRepository<T, ID> service) {
        this.service = service;
    }

    @Override
    public T save(T entity) {
        entity.setState(State.Active);
        return service.save(entity);
    }

    @Override
    public Iterable<T> saveAll(Iterable<T> entities) {
        return service.saveAll(entities);
    }

    @Override
    public T update(T entity) {
        return service.save(entity);
    }

    @Override
    public void deleteById(ID id) {
        T entity = service.getReferenceById(id);
        entity.setState(State.Deleted);
        service.save(entity);
    }

    @Override
    public T findById(ID id) {
        return  service.getReferenceById(id);
    }

    @Override
    public List<T> findAll() {
        return service.findAll();
    }
}
