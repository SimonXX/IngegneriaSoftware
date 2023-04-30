package designPatterns.Builder.casoParticolare;

public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder {
        // Required parameters
        private final int servingSize;
        private final int servings;
        // Optional
        private int calories = 0;
        private int fat = 0;
        private int carbohydrate = 0;
        private int sodium = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            calories = val;
            return this;
        }

        public Builder fat(int val) {
            fat = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);//creiamo il nostro oggetto concreto (Product) passando come parametro il builder appena definito
        }
    }

    private NutritionFacts(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Serving size: ").append(servingSize).append("g\n");
        sb.append("Servings per container: ").append(servings).append("\n");
        sb.append("Calories per serving: ").append(calories).append("kcal\n");
        sb.append("Fat per serving: ").append(fat).append("g\n");
        sb.append("Sodium per serving: ").append(sodium).append("mg\n");
        sb.append("Carbohydrate per serving: ").append(carbohydrate).append("g\n");
        return sb.toString();
    }

}
