package org.example.lesson_11

class RecipeCategory(
    val id: String,
    val name: String,
    val image: String,
) {
    val recipeList = mutableListOf<Recipe>()
}

class Recipe(
    val id: String,
    val image: String,
    val title: String,
    val categoryID: String,
    val portions: String,
    val ingridients: String,
    val steps: String,
)

class Ingredient(
    val name: String,
    val amount: Double,
    val unit: String,
)