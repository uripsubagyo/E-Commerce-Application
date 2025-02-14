package com.app.payloads;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class CardInformation {
    private String cardNumber;
    private Integer cvcNumber;
}
