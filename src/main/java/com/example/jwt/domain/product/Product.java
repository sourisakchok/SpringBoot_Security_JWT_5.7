package ch.wiss1.domain.product;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

  @Entity
  @Table (name = "product") // Wenn klasse gleich wie table ist muss man das nicht machen
  public class Product {
  @Id
  @GeneratedValue(generator = "uuid2")
    @GenericGenerator( name = "uuid2", strategy = "uuid2")
  @Column(name = "id", updatable = false, nullable = false)
  private UUID id;

  @Column(name = "name", nullable = false)
  private String name;

  @Column(name = "price")
  private int price;



  public Product(UUID id, String name, int price) {
    this.id = id;
    this.name = name;
    this.price = price;
  }

    public Product() {

    }

    public UUID getId() {
    return id;
  }

  public Product setId(UUID id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return name;
  }

  public Product setName(String name) {
    this.name = name;
    return this;
  }

  public double getPrice() {
    return price;
  }

  public Product setPrice(int price) {
    this.price = price;
    return this;
  }

}
