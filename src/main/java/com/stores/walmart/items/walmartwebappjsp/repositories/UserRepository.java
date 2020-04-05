package com.stores.walmart.items.walmartwebappjsp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stores.walmart.items.walmartwebappjsp.domain.User;

public interface UserRepository extends JpaRepository<User, Integer>
{

}