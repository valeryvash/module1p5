package effectiveJava.builder.myexample;

public class GreekSalad extends Salad {

    public static class Builder extends Salad.Builder<Builder>{

        @Override
        public Builder addIngredient(Ingredient ingredient) {
            return super.addIngredient(ingredient);
        }

        @Override
        Salad build() {
            return new GreekSalad(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    GreekSalad(Builder builder) {
        super(builder);
    }
}
