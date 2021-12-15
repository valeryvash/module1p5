package effectiveJava.builder;


public class Client {
    public static void main(String[] args) {

        NutritionFacts nf = new NutritionFacts
                .Builder(200, 40)
                .calories(200)
                .sodium(100)
                .carbohydrate(27)
                .build();

        NYPizza nyPizza = new NYPizza
                .Builder(NYPizza.Size.SMALL)
                .addTopping(Pizza.Topping.SAUSAGE)
                .addTopping(Pizza.Topping.ONION)
                .build();

        Calzone calzone = new Calzone.Builder()
                .addTopping(Pizza.Topping.HUM)
                .sauceInside()
                .build();
    }
}
