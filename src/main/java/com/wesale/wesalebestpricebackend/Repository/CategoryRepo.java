package com.wesale.wesalebestpricebackend.Repository;

import com.wesale.wesalebestpricebackend.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Long> {
}
