public class ClassTest
{
    public static void main()
    {
        Ingredient pât = new Ingredient("pâte",3.0);
        Ingredient sauce = new Ingredient("saucetomate",1.5);
        Ingredient from  = new Ingredient("fromage",2.0);
        Ingredient jamb = new Ingredient("jambon",2.0);
        Ingredient fruit = new Ingredient("fruitDeMer",2.5);
        Ingredient crème = new Ingredient("crèmeBlanche",1.5);
        Ingredient champi = new Ingredient("champignon",1.0);

        Pizza Marghe= new Pizza("Margherita");
        Pizza Prosc = new Pizza("Prosciutto");
        Pizza Frut = new Pizza("Fruttidimare");
        Pizza carbo=  new Pizza("carbonara");

        Marghe.ajouter(pât);
    }
}
