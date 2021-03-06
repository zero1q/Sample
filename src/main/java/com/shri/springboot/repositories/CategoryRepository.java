package com.shri.springboot.repositories;

import com.shri.springboot.model.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @Author: ZeeroIQ
 * @Date: 7/22/2019 4:45 AM
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> findByDescription(String description);
}
