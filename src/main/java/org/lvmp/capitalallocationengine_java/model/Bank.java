package org.lvmp.capitalallocationengine_java.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private UUID id;

    @Column(nullable = false)
    private Integer accountNumber;

    @Column(nullable = false)
    private String accountHolder;
}
