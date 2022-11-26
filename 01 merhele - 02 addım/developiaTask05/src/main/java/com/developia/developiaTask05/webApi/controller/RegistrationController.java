package com.developia.developiaTask05.webApi.controller;

import com.developia.developiaTask05.business.abstracts.RegistrationService;
import com.developia.developiaTask05.business.requests.CreateRegistrationRequest;
import com.developia.developiaTask05.business.responses.GetAllRegistrationResponse;
import com.developia.developiaTask05.entities.Registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/registration")
public class RegistrationController {

    private final RegistrationService registrationService;

    @Autowired
    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @GetMapping("/getall")
    public List<GetAllRegistrationResponse> getAll(){
        return registrationService.getAll();
    }

    @PostMapping("/add")
    public void add(CreateRegistrationRequest createRegistrationRequest){
        this.registrationService.add(createRegistrationRequest);
    }
}
