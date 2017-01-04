package com.greenfox.csaba.reddit.Services;

import com.greenfox.csaba.reddit.Post;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by almasics on 2017.01.04..
 */
public interface PostRepository extends CrudRepository<Post, Long> {
}
