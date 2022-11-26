package com.developia.developiaTask05.business.concrets;

import com.developia.developiaTask05.business.abstracts.RegistrationService;
import com.developia.developiaTask05.business.requests.CreateRegistrationRequest;
import com.developia.developiaTask05.business.responses.GetAllRegistrationResponse;
import com.developia.developiaTask05.dataAcces.RegistrationRepository;
import com.developia.developiaTask05.entities.Registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RegistrationManager implements RegistrationService {

    private final RegistrationRepository registrationRepository;

    @Autowired
    public RegistrationManager(RegistrationRepository registrationRepository) {
        this.registrationRepository = registrationRepository;
    }

    @Override
    public List<GetAllRegistrationResponse> getAll() {
        List<Registration> registrations = registrationRepository.findAll();
        List<GetAllRegistrationResponse> getAllRegistrationResponses = new ArrayList<GetAllRegistrationResponse>();

        for(Registration register: registrations){
            GetAllRegistrationResponse getAllRegistrationResponse = new GetAllRegistrationResponse();
            getAllRegistrationResponse.setId(register.getId());
            getAllRegistrationResponse.setName(register.getName());
            getAllRegistrationResponse.setSurname(register.getSurname());
            getAllRegistrationResponse.setBirth(register.getBirth());

            getAllRegistrationResponses.add(getAllRegistrationResponse);
        }


        return getAllRegistrationResponses;
    }

    @Override
    public void add(CreateRegistrationRequest createRegistrationRequest) {
        Registration registration = new Registration();
        registration.setName(createRegistrationRequest.getName());
        registration.setSurname(createRegistrationRequest.getSurname());
        registration.setBirth(createRegistrationRequest.getBirth());

        this.registrationRepository.save(registration);
    }
}
