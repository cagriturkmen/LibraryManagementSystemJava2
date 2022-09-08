package com.bilgeadam.librarymanagementsystem.service;

import com.bilgeadam.librarymanagementsystem.repository.entity.StateInfo;

import java.util.List;

public interface IServices<T extends StateInfo,ID> {

   T save(T entity);
   Iterable<T> saveAll(Iterable<T> entities);
   T update(T entity);
   void deleteById(ID id);
   T findById(ID id);
   List<T> findAll();

}
