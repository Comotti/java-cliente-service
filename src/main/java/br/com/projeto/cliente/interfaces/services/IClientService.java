package br.com.projeto.cliente.interfaces.services;

import br.com.projeto.cliente.models.Client;

import java.util.List;

public interface IClientService {
    public List<Client> findAll();
    public Client findClientById(long id);
    public Client save(Client client);
    public void deleteById(long id);
    public Client alter(Client client);
    public boolean existsById(long id);
    public List<Client> findByNameIgnoreCaseContaining(String name);
}
