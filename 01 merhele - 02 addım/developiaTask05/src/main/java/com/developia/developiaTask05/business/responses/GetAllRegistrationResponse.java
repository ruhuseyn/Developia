package com.developia.developiaTask05.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllRegistrationResponse {
    private int id;
    private String name;
    private String surname;
    private LocalDate birth;
}
