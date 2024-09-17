public class ApplePieRecipe {

    public Ingredient butter = new Ingredient(200, "grams", "ongezouten roomboter");
    public Ingredient sugar = new Ingredient(200, "grams", "witte bastard suiker");
    public Ingredient flour = new Ingredient(400, "grams", "zelfrijzend bakmeel");
    public Ingredient egg = new Ingredient(1, "stuk", "ei");
    public Ingredient vanillaSugar = new Ingredient(8, "grams", "vanillesuiker");
    public Ingredient salt = new Ingredient(1, "snuf", "zout");
    public Ingredient apples = new Ingredient(1500, "kilo", "zoetzure appels");
    public Ingredient crystalSugar = new Ingredient(75, "grams", "kristal suiker");
    public Ingredient cinnamon = new Ingredient(3, "theelepels", "kaneel");
    public Ingredient breadcrumbs = new Ingredient(15, "grams", "paneermeel");
    
    
    public void printIngredients() {
        System.out.println("Ingrediënten:");
        System.out.println(butter.getAmount() + " " + butter.getUnit() + " " + butter.getName());
        System.out.println(sugar.getAmount() + " " + sugar.getUnit() + " " + sugar.getName());
        System.out.println(flour.getAmount() + " " + flour.getUnit() + " " + flour.getName());
        System.out.println(egg.getAmount() + " " + egg.getUnit() + " " + egg.getName());
        System.out.println(vanillaSugar.getAmount() + " " + vanillaSugar.getUnit() + " " + vanillaSugar.getName());
        System.out.println(salt.getAmount() + " " + salt.getUnit() + " " + salt.getName());
        System.out.println(apples.getAmount() + " " + apples.getUnit() + " " + apples.getName());
        System.out.println(crystalSugar.getAmount() + " " + crystalSugar.getUnit() + " " + crystalSugar.getName());
        System.out.println(cinnamon.getAmount() + " " + cinnamon.getUnit() + " " + cinnamon.getName());
        System.out.println(breadcrumbs.getAmount() + " " + breadcrumbs.getUnit() + " " + breadcrumbs.getName());
    }

    public void preheatOven() {
        System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte).");
    }

    public void prepareEgg() {
        System.out.println("Klop het ei los en verdeel deze in twee delen. Eén helft is voor het deeg, de andere helft is voor het bestrijken van de appeltaart.");
    }

    public void makeDough() {
        System.out.println("Meng de boter, suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg.");
    }

    public void prepareApples() {
        System.out.println("Schil de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }

    public void prepareForm() {
        System.out.println("Vet de springvorm in en bestrooi deze met bloem.");
    }

    public void prepareCrust() {
        System.out.println("Gebruik een deel van het deeg om de bodem van de vorm te bedekken en een ander deel om de rand te bekleden. Strooi het paneermeel op de bodem.");
    }

    public void addApples() {
        System.out.println("Doe de helft van de appels in de vorm en strooi 1/3 van het kaneel-suiker mengsel erover. Meng de andere helft van de appels met het overgebleven mengsel en leg dit in de vorm.");
    }

    public void makeTopCrust() {
        System.out.println("Rol het laatste deel van het deeg uit tot een dunne lap en snij stroken van 1 cm breed. Leg de stroken kruislinks op de appeltaart.");
    }

    public void bakePie() {
        System.out.println("Zet de taart iets onder het midden van de oven en bak deze in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }
}
