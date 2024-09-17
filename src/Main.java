public class Main {
    public static void main(String[] args) {
        ApplePieRecipe recipe = new ApplePieRecipe();


        recipe.printIngredients();

        recipe.preheatOven();
        recipe.prepareEgg();
        recipe.makeDough();
        recipe.prepareApples();
        recipe.prepareForm();
        recipe.prepareCrust();
        recipe.addApples();
        recipe.makeTopCrust();
        recipe.bakePie();
    }
}
