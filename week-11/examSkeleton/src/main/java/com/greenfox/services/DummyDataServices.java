package com.greenfox.services;

import com.greenfox.domain.DummyData;
import com.greenfox.repositories.DummyDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by almasics on 2017.01.09..
 */
@Service
public class DummyDataServices {
    private DummyDataRepository dummyDataRepository;

    @Autowired
    public DummyDataServices(DummyDataRepository dummyDataRepository) {
        this.dummyDataRepository = dummyDataRepository;
    }

    public DummyData saveData(DummyData dummyData) {
        return dummyDataRepository.save(dummyData);
    }

    public Iterable<DummyData> list() {
        return dummyDataRepository.findAll();
    }
}
