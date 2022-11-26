package com.developia.developiaTask05.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateRegistrationRequest {

    private String name;
    private String surname;
    private LocalDate birth;
}
