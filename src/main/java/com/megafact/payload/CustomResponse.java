package com.megafact.payload;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomResponse {

    private Integer codigo;
    private String mensaje;
}
