package reto5.repository;

import reto5.crud.ClientCrud;
import reto5.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClientRepository {
    @Autowired
    private ClientCrud clientCrud;

    public List<Client> getAll() {
        return (List<Client>) clientCrud.findAll();
    }

    public Optional<Client> getClient(int id) {
        return clientCrud.findById(id);
    }

    public Client save (Client client) {
        return clientCrud.save(client);
    }

    public void delete(Client client) {
        clientCrud.delete(client);
    }
}
