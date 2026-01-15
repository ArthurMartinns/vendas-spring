package com.projetospring.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetospring.vendas.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
