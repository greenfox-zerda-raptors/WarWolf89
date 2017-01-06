package com.greenfox.csaba.reddit.domain;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by almasics on 2017.01.04..
 */
public interface PostRepository extends CrudRepository<Post, Long> {
}
