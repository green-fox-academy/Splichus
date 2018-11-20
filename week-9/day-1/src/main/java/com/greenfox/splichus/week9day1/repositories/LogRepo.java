package com.greenfox.splichus.week9day1.repositories;

import com.greenfox.splichus.week9day1.models.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogRepo extends CrudRepository<Log,Long> {

    @Override
    List<Log> findAll();
}
