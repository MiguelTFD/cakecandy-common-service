package com.cakecandy.dto.identitydocument;

import com.cakecandy.entity.types.IdentityDocumentType;
import lombok.Data;

@Data
public class IdentityDocumentRequestDTO {
  private String identityDocumentNumber;
  private IdentityDocumentType identityDocumentType;
  private Long userId;
}
