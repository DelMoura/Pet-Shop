package com.backend.petshop.service;

import com.backend.petshop.domain.Client;
import com.backend.petshop.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceClient {
    private final ClientRepository clientRepository;

    public ServiceClient(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> saveClient(Client client){
        this.clientRepository.save(client);
        return null;
    }
}
