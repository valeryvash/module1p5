package effectiveJava.builder.myexample;

import java.util.EnumSet;
import java.util.Set;

public abstract class Salad {
    public enum Ingredient {TOMATO, ONION, CUCUMBER, OLIVE, SALT, CHEESE,SUNFLOWER_OIL,LEMON_JUICE,
        GARLIC,BLACK_PEPPER,RED_ONION,CHEESE_FETA,OREGANO,OLIVES_OIL}

    final Set<Ingredient> ingredients;

    abstract static class Builder<T extends Builder<T>>{
        EnumSet<Ingredient> ingredients = EnumSet.noneOf(Ingredient.class);

        public T addIngredient(Ingredient ingredient){
            ingredients.add(ingredient);
            return self();
        }

        abstract Salad build();

        protected abstract T self();
    }

    Salad(Builder builder){ this.ingredients = builder.ingredients.clone();   }



}
