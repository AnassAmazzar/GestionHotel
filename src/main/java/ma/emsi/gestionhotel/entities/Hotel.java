package ma.emsi.gestionhotel.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Entity
 @NoArgsConstructor
public class Hotel {
@Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

private String nomHotel;

@Getter
private String adresse;
private int nombreChambres;


public Hotel(Integer id , String nom, String adr, int nbr){
    this.id = id;
    this.nomHotel=nom;
    this.adresse=adr;
    this.nombreChambres=nbr;
}

public String getNom(){
    return this.nomHotel;
}
    public void setNom(String nom){
    this.nomHotel=nom;
}

    public void setAdresse(String adr){
        this.adresse=adr;
    }
    public int getNombre(){
    return this.nombreChambres;
    }
    public void setNombre(int nbr){
    this.nombreChambres=nbr;
    }

    public void ajouterChambre(Chambre chambre){

    }

    public void supprimerChambre(Chambre chambre){

    }

    public void rechercherChambre(int numeroChambre){

    }




}
