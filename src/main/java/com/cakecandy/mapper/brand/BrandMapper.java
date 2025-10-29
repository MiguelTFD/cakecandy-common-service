package com.cakecandy.mapper.brand;

import com.cakecandy.dto.brand.BrandRequestDto;
import com.cakecandy.dto.brand.BrandResponseDto;
import com.cakecandy.entity.Brand;
import org.springframework.stereotype.Component;

@Component
public class BrandMapper {
  public BrandResponseDto toDo(Brand brand) {
    return BrandResponseDto.builder()
        .id(brand.getBrandId())
        .name(brand.getName())
        .build();
  }

  public Brand toEntity(BrandRequestDto requestDto) {
    return Brand.builder()
        .name(requestDto.getName())
        .build();
  }

  public Brand toEntityBrand(BrandResponseDto responseDto) {
    return Brand.builder()
        .brandId(responseDto.getId())
        .name(responseDto.getName())
        .build();
  }
}
