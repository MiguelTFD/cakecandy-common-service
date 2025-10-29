package com.cakecandy.dto.order;

import com.cakecandy.entity.types.OrderStatusType;
import com.cakecandy.dto.orderDetail.OrderDetailResponseDto;

import lombok.Data;
import lombok.Builder;
import java.util.Date;
import java.util.List;

@Data
@Builder
public class OrderResponseDto {
  private Long orderId;
  private Date orderDate;
  private String deliveryType;
  private String orderInfo;
  private String deliveryInstructions;
  private OrderStatusType orderStatus;
  private Long userId;

  @Builder.Default
  private List<OrderDetailResponseDto> details = List.of();
}
