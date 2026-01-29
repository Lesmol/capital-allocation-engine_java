package org.lvmp.capitalallocationengine_java.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(unique = true)
    private String digitalId;

    @Column(nullable = false, unique = true)
    private Integer idNumber;

    @ManyToOne
    @JoinColumn(name = "bank_id")
    private Bank bank;

    private Integer debitDate;
}
