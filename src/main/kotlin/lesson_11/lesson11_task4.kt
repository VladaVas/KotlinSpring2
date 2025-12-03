package org.example.lesson_11

class RecipeCategory {
    val id: String
    val name: String
    val image: String
    val recipeList: MutableList<Recipe>

    constructor(id: String, name: String, image: String, recipeList: MutableList<Recipe>) {
        this.id = id
        this.name = name
        this.image = image
        this.recipeList = recipeList
    }
}

class Recipe {
    val id: String
    val image: String
    val title: String
    val categoryID: String
    val portions: String
    val ingridients: List<Ingredient>
    val steps: String

    constructor(
        id: String,
        image: String,
        title: String,
        categoryID: String,
        portions: String,
        ingridients: List<Ingredient>,
        steps: String
    ) {
        this.id = id
        this.image = image
        this.title = title
        this.categoryID = categoryID
        this.portions = portions
        this.ingridients = ingridients
        this.steps = steps
    }
}

class Ingredient(
    val name: String,
    val amount: Double,
    val unit: String,
)