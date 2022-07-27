package pingwit.remove;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CosmetologyPerson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String number;
    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<CosmetologyOrder> orders = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<CosmetologyOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<CosmetologyOrder> cosmetologyOrders) {
        this.orders = cosmetologyOrders;
    }

}
