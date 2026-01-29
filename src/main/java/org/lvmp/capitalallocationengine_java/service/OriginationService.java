package org.lvmp.capitalallocationengine_java.service;

import org.lvmp.capitalallocationengine_java.dto.UserRequest;
import org.lvmp.capitalallocationengine_java.model.Bank;
import org.lvmp.capitalallocationengine_java.model.User;
import org.lvmp.capitalallocationengine_java.persistence.BankRepository;
import org.lvmp.capitalallocationengine_java.persistence.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OriginationService {

    private final UserRepository userRepository;
    private final BankRepository bankRepository;

    public OriginationService(UserRepository userRepository, BankRepository bankRepository) {
        this.userRepository = userRepository;
        this.bankRepository = bankRepository;
    }

    @Transactional
    public ResponseEntity<User> createUser(UserRequest request) {
        try {
            Bank bank = Bank.builder()
                    .accountNumber(request.getAccountNumber())
                    .accountHolder(request.getAccountHolder())
                    .build();
            bankRepository.save(bank);

            User user = User.builder()
                    .digitalId(request.getDigitalId())
                    .idNumber(request.getIdNumber())
                    .bank(bank)
                    .debitDate(request.getDebitDate())
                    .build();
            userRepository.save(user);

            return ResponseEntity.ok(user);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }

    public ResponseEntity<Void> joinPool() {
        return ResponseEntity.ok().build();
    }

    public ResponseEntity<Void> createPool() {
        return ResponseEntity.ok().build();
    }
}
