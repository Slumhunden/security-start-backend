package dat3.recipe.service;

import dat3.recipe.repository.CategoryRepository;
import jdk.jfr.Category;
import org.springframework.stereotype.Service;

import java.util.List;

public class CategoryService {
    public List<String> getAllCategories() {
    }

    @Service
    public class CategoryService {

        CategoryRepository categoryRepository;

        public CategoryService(CategoryRepository categoryRepository) {
            this.categoryRepository = categoryRepository;
        }

        public List<String> getAllCategories() {
            List<Category> categories =  categoryRepository.findAll();
            //Convert from list of Categories to DTO-type, list of Strings
            return categories.stream().map((c)->new String(c.getName())).toList();
        }
    }

}
