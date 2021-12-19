package effectiveJava.builder;


import java.util.*;

public class Client {
    public static void main(String[] args) {
//
//        NutritionFacts nf = new NutritionFacts
//                .Builder(200, 40)
//                .calories(200)
//                .sodium(100)
//                .carbohydrate(27)
//                .build();
//
//        NYPizza nyPizza = new NYPizza
//                .Builder(NYPizza.Size.SMALL)
//                .addTopping(Pizza.Topping.SAUSAGE)
//                .addTopping(Pizza.Topping.ONION)
//                .build();
//
//        Calzone calzone = new Calzone.Builder()
//                .addTopping(Pizza.Topping.HUM)
//                .sauceInside()
//                .build();

        Map<String, String> secretToGuess = new HashMap<>();
//        secretToGuess.put("AABC", "ADFE");
//        secretToGuess.put("AABC", "DEFA");
        secretToGuess.put("ABCD", "EAAA");

        Set<String> secretSet = secretToGuess.keySet();

        for (String secret : secretSet) {
            String guess = secretToGuess.get(secret);
            System.out.println("Secret: " + secret + "\nKey: " + guess);
            Result result = makeGuess(secret, guess);
            System.out.println(result.rightPos + " : " + result.wrongPos);
        }

    }

    private static class Result{
        int rightPos;
        int wrongPos;

        public Result(int rightPos, int wrongPos) {
            this.rightPos = rightPos;
            this.wrongPos = wrongPos;
        }
    }

    public static Result makeGuess(String secret, String guess) {
        int rPos = 0;
        int wPos = 0;
        List<Character> secretList = new ArrayList<>();
        List<Character> guessList = new ArrayList<>();

        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                rPos++;
            }
            secretList.add(secret.charAt(i));
            guessList.add(guess.charAt(i));
        }

//        secretList.retainAll(guessList);

        for (int i = 0; i < secretList.size(); i++) {
            if (secretList.remove(guessList.get(i))) {
                wPos++;
            }
        }

        wPos -= rPos;

        return new Result(rPos, wPos);
    }


}
