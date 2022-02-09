/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modele;

import java.util.Objects;

/**
 *
 * @author pc
 */
public class Recherche {
    
    private String nom;
    private String langage;

    public Recherche() {
    }

    public Recherche(String nom, String langage) {
        this.nom = nom;
        this.langage = langage;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLangage() {
        return langage;
    }

    public void setLangage(String langage) {
        this.langage = langage;
    }

   

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Recherche other = (Recherche) obj;
        if (!Objects.equals(this.langage, other.langage)) {
            return false;
        }
        return true;
    }
    
    
    
}
