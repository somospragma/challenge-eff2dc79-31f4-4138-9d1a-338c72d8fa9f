package com.bank.system.infrastructure.repository;

import com.bank.system.domain.model.Account;
import com.bank.system.domain.port.AccountRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.Optional;
import java.util.UUID;

@Repository
public class JpaAccountRepository implements AccountRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public Account save(Account account) {
        entityManager.persist(account);
        return account;
    }

    @Override
    public Optional<Account> findById(UUID id) {
        return Optional.ofNullable(entityManager.find(Account.class, id));
    }

    @Override
    public Optional<Account> findByAccountNumber(String accountNumber) {
        var query = entityManager.createQuery("SELECT a FROM Account a WHERE a.accountNumber = :accountNumber", Account.class);
        query.setParameter("accountNumber", accountNumber);
        return query.getResultList().stream().findFirst();
    }

    @Override
    @Transactional
    public void deleteById(UUID id) {
        var account = findById(id).orElseThrow(() -> new RuntimeException("Account not found"));
        entityManager.remove(account);
    }
}