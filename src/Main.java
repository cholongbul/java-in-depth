import effactivejava.pizza.NutritionFacts;

public class Main {
    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(204,8).calories(100).soditum(35).carbohydrate(27).build();

        System.out.println();
    }
}
