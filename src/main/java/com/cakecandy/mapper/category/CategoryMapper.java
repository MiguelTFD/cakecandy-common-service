package com.cakecandy.mapper.category;

import com.cakecandy.dto.category.CategoryRequestDto;
import com.cakecandy.dto.category.CategoryResponseDto;
import com.cakecandy.entity.Category;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapper {
  public CategoryResponseDto toDo(Category category) {
    return CategoryResponseDto.builder()
        .id(category.getCategoryId())
        .name(category.getName())
        .build();
  }

  public Category toEntity(CategoryRequestDto requestDto) {
    return Category.builder()
        .name(requestDto.getName())
        .build();
  }

  public Category toEntityCategory(CategoryResponseDto responseDto) {
    return Category.builder()
        .categoryId(responseDto.getId())
        .name(responseDto.getName())
        .build();
  }
}
