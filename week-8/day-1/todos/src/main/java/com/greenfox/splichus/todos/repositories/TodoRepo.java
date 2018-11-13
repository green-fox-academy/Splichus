package com.greenfox.splichus.todos.repositories;

import com.greenfox.splichus.todos.models.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepo extends CrudRepository<Todo, Long> {

    @Override
    List<Todo> findAll();
}
