package com.greenfox.splichus.repositories;



import com.greenfox.splichus.models.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepo extends CrudRepository<Todo, Long> {

    @Override
    List<Todo> findAll();
}
