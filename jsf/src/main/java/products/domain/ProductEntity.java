package products.domain;

import javax.persistence.*;

import products.Product;

@Entity
@Table(name = "productentity")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private long price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Product toDto(){
        Product product = new Product();
        product.setId(this.getId());
        product.setPrice(this.getPrice());
        product.setName(this.getName());

        return product;
    }

    public void fromDto(Product product){
        this.setId(product.getId());
        this.setName(product.getName());
        this.setPrice(product.getPrice());
    }
}