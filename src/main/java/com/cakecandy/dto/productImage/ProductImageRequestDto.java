package com.cakecandy.dto.productImage;

import lombok.Data;

@Data
public class ProductImageRequestDto {
  private String imageUrl;
  private Long productId;
}
