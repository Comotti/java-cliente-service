package br.com.projeto.cliente.interfaces.repositories;

import br.com.projeto.cliente.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
