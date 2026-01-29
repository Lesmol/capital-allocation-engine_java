package org.lvmp.capitalallocationengine_java.dto;

import lombok.Builder;
import lombok.Data;

@Data
public class UserRequest {
    private Integer accountNumber;
    private String accountHolder;
    private String digitalId;
    private Integer idNumber;
    private Integer debitDate;
}
