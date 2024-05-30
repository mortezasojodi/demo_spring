package com.spring5.demo.controller.reponseDto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductResponse {
    private int id;
    private String name;
}
