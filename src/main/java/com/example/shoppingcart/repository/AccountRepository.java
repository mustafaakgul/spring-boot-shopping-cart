package com.example.shoppingcart.repository;

import com.example.shoppingcart.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

    Account findAccountByUserName(String userName);
}
