package org.lvmp.capitalallocationengine_java.persistence;

import org.lvmp.capitalallocationengine_java.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BankRepository extends JpaRepository<Bank, UUID> {
}
