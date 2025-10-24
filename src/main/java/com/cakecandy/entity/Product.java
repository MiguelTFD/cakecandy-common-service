package com.cakecandy.entity;

import java.math.BigDecimal;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "product_id")
  private Long productId;

  @Column(name = "product_name", nullable = false)
  private String productName;

  @Column(name = "product_stock", nullable = false)
  private Integer productStock;

  @Column(name = "product_unit_price", nullable = false, precision = 10, scale = 2)
  private BigDecimal productUnitPrice;

  @Column(name = "product_description", columnDefinition = "TEXT")
  private String productDescription;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "category_id", nullable = false)
  private Category category;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "brand_id", nullable = false)
  private Brand brand;
}
