import java.util.HashMap;

import static java.util.Objects.requireNonNull;

public class Ingredient implements Aliment {
    private String nom;
    private float prix;


    //CONSTRUCTOR
    public Ingredient(String nom, Float prix)
    {
        this.nom = requireNonNull(nom, "le nom de doit pas être null");
        this.prix = requireNonNull(prix, "le prix de doit pas être null");

    }

    //LES SETTERS
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public String getNom()
    {
        return nom;
    }

    public float getPrix()
    {
        return prix;
    }

    public void execute()
    {

    }

    @Override
    public String toString()
    {
        return "Ingredient{" +
            "nom='" + nom + '\'' +
            ", prix=" + prix +
            '}';
    }
}
