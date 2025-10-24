package com.cakecandy.entity;

import java.util.Date;
import java.util.Set;

import com.cakecandy.entity.types.OrderStatusType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.LinkedHashSet;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class Order {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "order_id")
  private Long orderId;

  @Column(name = "order_date", nullable = false)
  private Date orderDate;

  @Column(name = "delivery_type", nullable = false)
  private String deliveryType;

  @Column(name = "order_info", nullable = false)
  private String orderInfo;

  @Column(name = "delivery_instructions", nullable = false)
  private String deliveryInstructions;

  @Enumerated(EnumType.STRING)
  @Column(name = "order_status", nullable = false)
  private OrderStatusType orderStatus;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "user_id")
  private User user;

  @OneToMany(mappedBy = "order")
  @Builder.Default
  private Set<OrderDetail> orderDetails = new LinkedHashSet<>();

}
