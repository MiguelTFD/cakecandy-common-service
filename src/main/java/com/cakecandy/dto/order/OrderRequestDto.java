package com.cakecandy.dto.order;

import com.cakecandy.entity.types.OrderStatusType;
import com.cakecandy.dto.orderDetail.OrderDetailRequestDto;

import lombok.Data;
import java.util.Date;
import java.util.List;

@Data
public class OrderRequestDto {
  private Date orderDate;
  private String deliveryType;
  private String orderInfo;
  private String deliveryInstructions;
  private OrderStatusType orderStatus;
  private Long userId;
  private List<OrderDetailRequestDto> details;
}
