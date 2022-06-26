package com.backend.petshop.service;

import com.backend.petshop.domain.Client;
import com.backend.petshop.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ServiceClient {
    private final ClientRepository clientRepository;

    public ServiceClient(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void saveClient(Client client) {
        this.clientRepository.save(client);
    }

    public void deleteClient(Client client) {
        this.clientRepository.delete(client);
    }

    public List<Client> allClient() {
        return this.clientRepository.findAll();
    }

    public Optional<Client> selectByClient(Client client){
        return this.clientRepository.findById(client.getId());

    }

    
}
