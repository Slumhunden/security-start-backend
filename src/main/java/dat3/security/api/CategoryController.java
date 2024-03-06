package dat3.security.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

    public class CategoryController {
    @RequestMapping("/categories")
    @RestController

        CategoryService categoryService;

        public CategoryController(CategoryService categoryService) {
            this.categoryService = categoryService;
        }

        @GetMapping
        public List<String> getAllCategories() {
            return categoryService.getAllCategories();
        }
    }


