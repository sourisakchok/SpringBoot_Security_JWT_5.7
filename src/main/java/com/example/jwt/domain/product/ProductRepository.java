package ch.wiss1.domain.product;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {

    //Derived queries
    List<Product> findByNameEndingWith(String name);

    //Named Queries
    @Query(value = "SELECT * FROM Product WHERE price = 99", nativeQuery = true)
    List<Product> findAllProductsNativeQuery();


//    Derived queries
    Product findTopByOrderByPriceDesc();

//    Named Queries
    @Query(value = "SELECT * FROM Product ORDER BY price DESC LIMIT 1", nativeQuery = true)
    Product findMostExpensiveProduct();
}
