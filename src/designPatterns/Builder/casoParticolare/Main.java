package designPatterns.Builder.casoParticolare;

public class Main {
    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(30, 2) //accediamo alla innerclass
                .calories(200)
                .fat(8)
                .carbohydrate(25)
                .sodium(240)
                .build();
        //abbiamo due campi obbligatori con associazione posizione e tutti gli altri opzionali

        System.out.println(nutritionFacts);
    }
}
