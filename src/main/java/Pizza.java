import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static java.util.Objects.requireNonNull;

public class Pizza implements Aliment
{
    private String nom;
    private Set<Ingredient> ingredientSet = new HashSet<>();

    public Pizza(String nom)
    {
        this.nom = requireNonNull(nom,"le nom de doit pas être null");
    }


    public String getNom()
    {
        return nom;
    }

    public float getPrix()
    {
        float prix = 0;
        for(Ingredient i : ingredientSet)
        {
            prix +=i.getPrix();
        }
        return prix;
    }

    public void ajouter(Ingredient e)
    {
            ingredientSet.add(e);
    }

    public void retirer(Ingredient e)
    {
        ingredientSet.remove(e);
    }





    @Override
    public String toString()
    {
        return "Pizza{" +
            "nom='" + nom + '\'' +
            ", ingredientSet=" + ingredientSet +
            '}';
    }
}
