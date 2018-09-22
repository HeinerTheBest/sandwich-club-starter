package com.udacity.sandwichclub.model;

import java.util.List;

public class Sandwich {

    private String mainName;
    private List<String> alsoKnownAs;
    private String placeOfOrigin;
    private String description;
    private String image;
    private String aux = "Don't Found";
    private List<String> ingredients;


    public Sandwich(String mainName, List<String> alsoKnownAs, String placeOfOrigin, String description, String image, List<String> ingredients) {
        this.mainName = mainName;
        this.alsoKnownAs = alsoKnownAs;
        this.placeOfOrigin = placeOfOrigin;
        this.description = description;
        this.image = image;
        this.ingredients = ingredients;
    }

    public String getMainName() {
        if(mainName.isEmpty())
            return aux;

        return mainName;
    }

    public List<String> getAlsoKnownAs() {
        if(alsoKnownAs.isEmpty())
            alsoKnownAs.add(aux);
        return alsoKnownAs;
    }

    public String getPlaceOfOrigin() {
        if(placeOfOrigin.isEmpty())
            return aux;
        return placeOfOrigin;
    }

    public String getDescription() {
        if(description.isEmpty())
            return aux;
        return description;
    }


    public String getImage() {
        return image;
    }


    public List<String> getIngredients() {
        if(ingredients.isEmpty())
            ingredients.add(aux);
        return ingredients;
    }

}
