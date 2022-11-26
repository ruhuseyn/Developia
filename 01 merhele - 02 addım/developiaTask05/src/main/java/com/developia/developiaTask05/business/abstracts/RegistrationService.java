package com.developia.developiaTask05.business.abstracts;

import com.developia.developiaTask05.business.requests.CreateRegistrationRequest;
import com.developia.developiaTask05.business.responses.GetAllRegistrationResponse;
import com.developia.developiaTask05.entities.Registration;
import org.springframework.stereotype.Service;

import java.util.List;

public interface RegistrationService {

    List<GetAllRegistrationResponse> getAll();

    void add(CreateRegistrationRequest createRegistrationRequest);
}
