package com.mrr.apirest.apirestmrr.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mrr.apirest.apirestmrr.Entities.Recipe;


public interface RecipeRepositoy extends JpaRepository<Recipe,Long>{


}
