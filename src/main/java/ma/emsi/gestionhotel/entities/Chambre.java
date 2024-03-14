package ma.emsi.gestionhotel.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity @AllArgsConstructor @NoArgsConstructor
public class Chambre {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer numero;
    private String type;
    private int capacite;
    private boolean estDisponible;

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(Integer num){
        this.numero=num;
    }

    public String getType(){
        return this.type;
    }
    public void setType(String type){
        this.type=type;
    }

    public int getCapacite(){
        return this.capacite;
    }

    public void setCapacite(int cap){
        this.capacite=cap;
    }

    public boolean getDisponible(){
        return this.estDisponible;
    }
    public void setDisponible(boolean disp){
        this.estDisponible=disp;
    }


}
