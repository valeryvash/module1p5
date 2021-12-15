package effectiveJava.builder.myexample;

public class Test {
    public static void main(String[] args) {
        Salad greekSalad = new GreekSalad.Builder()
                .addIngredient(Salad.Ingredient.TOMATO)
                .addIngredient(Salad.Ingredient.RED_ONION)
                .addIngredient(Salad.Ingredient.CUCUMBER)
                .addIngredient(Salad.Ingredient.CHEESE_FETA)
                .addIngredient(Salad.Ingredient.OLIVE)
                .addIngredient(Salad.Ingredient.OLIVES_OIL)
                .addIngredient(Salad.Ingredient.LEMON_JUICE)
                .addIngredient(Salad.Ingredient.GARLIC)
                .addIngredient(Salad.Ingredient.OREGANO)
                .addIngredient(Salad.Ingredient.BLACK_PEPPER)
                .build();

    }
}
