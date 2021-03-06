package com.tooomor.online.store.delivery.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderDTO {
    String orderNumber;
    ClientDTO client;
    List<OrderItemDTO> orderItems;
}
