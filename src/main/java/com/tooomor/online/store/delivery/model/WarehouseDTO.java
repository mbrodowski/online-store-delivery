package com.tooomor.online.store.delivery.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WarehouseDTO {
    String code;
    String fullName;
    AddressDTO address;
}
