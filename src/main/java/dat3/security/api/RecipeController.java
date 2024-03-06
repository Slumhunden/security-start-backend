package dat3.security.api;
package dat3.recipe.dto;


import dat3.recipe.dto.RecipeDto;
import dat3.recipe.service.RecipeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class RecipeController {
    @GetMapping
    public List<RecipeDto.RecipeDto> getAllRecipes(@RequestParam(required = false) String category) {
        if(category != null) {
            System.out.println("Category: " + category);
        }
        return recipeService.getAllRecipes(category);
    }

    @RestController
    @RequestMapping("/recipes")
    public class RecipeController {
        @GetMapping(path ="/{id}")
        public RecipeDto getRecipeById(@PathVariable int id) {
            return recipeService.getRecipeById(id);
        }


        private RecipeService recipeService;

        public RecipeController(RecipeService recipeService) {
            this.recipeService = recipeService;
        }
    }

}
