package com.nashtech.training.shape.service.impl;

import com.nashtech.training.shape.model.Shape;
import com.nashtech.training.shape.model.ShapeCategory;
import com.nashtech.training.shape.respository.ShapeCategoryRepository;
import com.nashtech.training.shape.respository.ShapeRepository;
import com.nashtech.training.shape.service.ShapeService;
import com.nashtech.training.shape.utils.LongRunning;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ShapeServiceImpl implements ShapeService {

    final private ShapeRepository shapeRepository;
    final private ShapeCategoryRepository shapeCategoryRepository;
    final private JdbcTemplate jdbcTemplate;

    public ShapeServiceImpl(ShapeRepository shapeRepository, ShapeCategoryRepository shapeCategoryRepository, JdbcTemplate jdbcTemplate) {
        this.shapeRepository = shapeRepository;
        this.shapeCategoryRepository = shapeCategoryRepository;
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public List<ShapeCategory> getAllCategory() {
        return shapeCategoryRepository.findAll();
    }

    @Override
    public List<ShapeCategory> getAllCategoryFull() {
        return shapeCategoryRepository.findAll();
    }

    @Override
    public ShapeCategory saveCategory(ShapeCategory category) {
        return shapeCategoryRepository.save(category);
    }

    @Override
    public List<Shape> getAllShape() {
        return this.shapeRepository.findAll();
    }

    @Override
    public List<Shape> getAllShape(String user) {
        return this.shapeRepository.findAllWithAttributeByUser(user);
    }

    @Override
    public Optional<Shape> getShapeById(long id) {
        LongRunning.run();
        return this.shapeRepository.findOneWithAttributeById(id);
    }

    @Override
    public Optional<ShapeCategory> getCategory(long id) {
        return shapeCategoryRepository.findOneWithAttributeById(id);
    }

    @Override
    public Shape save(Shape shape) {
        return this.shapeRepository.save(shape);
    }

    @Override
    public boolean deleteShape(long id) {
       throw new NotImplementedException();
    }

    @Override
    public boolean deleteCategory(long id) {
        throw new NotImplementedException();
    }
}
