package com.nashtech.training.shape.respository;

import com.nashtech.training.shape.model.ShapeCategory;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ShapeCategoryRepository extends JpaRepository<ShapeCategory, Long> {

    @EntityGraph(attributePaths = "attributes")
    Optional<ShapeCategory> findOneWithAttributeById(Long id);

    @EntityGraph(attributePaths = "attributes")
    List<ShapeCategory> findAll();

}
