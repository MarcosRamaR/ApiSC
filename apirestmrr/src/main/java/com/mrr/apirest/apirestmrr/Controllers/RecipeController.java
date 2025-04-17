package com.mrr.apirest.apirestmrr.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrr.apirest.apirestmrr.Entities.Recipe;
import com.mrr.apirest.apirestmrr.Repositories.RecipeRepositoy;



@RestController
@RequestMapping("/recipes")
public class RecipeController {

    @Autowired
    private RecipeRepositoy recipeRepositoy;

    @GetMapping
    public List<Recipe> getAllRecipes(){
        return recipeRepositoy.findAll();
    }

    @GetMapping("/{id}")
    public Recipe getRecipeById(@PathVariable Long id){
        return recipeRepositoy.findById(id)
        .orElseThrow(() -> new RuntimeException("Recipe with ID: "+ id + " dont found"));
    }

    @PostMapping
    public Recipe creatRecipe(@RequestBody Recipe recipe){
        return recipeRepositoy.save(recipe);
    }

    @PutMapping("/{id}")
    public Recipe updatRecipe(@PathVariable Long id, @RequestBody Recipe recipeDetails){
        Recipe recipe = recipeRepositoy.findById(id)
        .orElseThrow(() -> new RuntimeException("Recipe with ID: "+ id + " dont found"));

        recipe.setName(recipeDetails.getName());
        recipe.setIngredients(recipeDetails.getIngredients());
        recipe.setSteps(recipeDetails.getSteps());

        return recipeRepositoy.save(recipe);
     }

     @DeleteMapping("/{id}"){
        public String  deleteRecipe(@PathVariable Long id){
            Recipe recipe = recipeRepositoy.findById(id)
            .orElseThrow(() -> new RuntimeException("Recipe with ID: "+ id + " dont found"));

            recipeRepositoy.delete(recipe);
            return "Recipe with ID: "+ id + " was deleted";
        }
     }



}
