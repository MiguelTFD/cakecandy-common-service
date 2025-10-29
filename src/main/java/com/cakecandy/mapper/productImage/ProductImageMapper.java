package com.cakecandy.mapper.productImage;

import com.cakecandy.dto.product.ProductRequestDto;
import com.cakecandy.dto.productImage.ProductImageRequestDto;
import com.cakecandy.dto.productImage.ProductImageResponseDto;
import com.cakecandy.entity.Product;
import com.cakecandy.entity.ProductImage;
import org.springframework.stereotype.Component;

@Component
public class ProductImageMapper {

  public ProductImageResponseDto toDto(ProductImage productImage) {
    return ProductImageResponseDto.builder()
        .id(productImage.getProductImageId())
        .imageUrl(productImage.getImageUrl())
        .productId(productImage.getProduct().getProductId())
        .productName(productImage.getProduct().getName())
        .build();
  }

  public ProductImage toEntity(ProductImageRequestDto requestDto, Product product) {
    return ProductImage.builder()
        .imageUrl(requestDto.getImageUrl())
        .product(product)
        .build();
  }
}
