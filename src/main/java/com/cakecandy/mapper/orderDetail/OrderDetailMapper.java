package com.cakecandy.mapper.orderDetail;

import com.cakecandy.entity.OrderDetail;
import com.cakecandy.entity.Order;
import com.cakecandy.entity.Product;
import com.cakecandy.dto.orderDetail.*;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderDetailMapper {

  public OrderDetail toEntity(OrderDetailRequestDto dto, Order order, Product product) {
    return OrderDetail.builder()
        .order(order)
        .product(product)
        .quantity(dto.getQuantity())
        .build();
  }

  public OrderDetailResponseDto toDto(OrderDetail detail) {
    return OrderDetailResponseDto.builder()
        .productId(detail.getProduct().getProductId())
        .productName(detail.getProduct().getName())
        .quantity(detail.getQuantity())
        .unitPrice(detail.getProduct().getUnitPrice())
        .build();
  }
}
