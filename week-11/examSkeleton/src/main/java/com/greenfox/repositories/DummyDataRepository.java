package com.greenfox.repositories;

import com.greenfox.domain.DummyData;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by almasics on 2017.01.09..
 */
public interface DummyDataRepository extends CrudRepository<DummyData, Long> {
}
