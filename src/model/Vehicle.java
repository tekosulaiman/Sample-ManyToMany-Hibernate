package model;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * @author tombisnis@yahoo.com
 */
@Entity
public class Vehicle {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vihicleId;
    private String vihicleName;

    @ManyToMany(mappedBy = "vehicle")
    private Collection<UserDetails> userDetails = new ArrayList<UserDetails>();
    
    public int getVihicleId() {
        return vihicleId;
    }

    public void setVihicleId(int vihicleId) {
        this.vihicleId = vihicleId;
    }

    public String getVihicleName() {
        return vihicleName;
    }

    public void setVihicleName(String vihicleName) {
        this.vihicleName = vihicleName;
    }

    public Collection<UserDetails> getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(Collection<UserDetails> userDetails) {
        this.userDetails = userDetails;
    }
}