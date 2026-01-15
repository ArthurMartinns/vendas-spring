package com.projetospring.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.vendas.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
