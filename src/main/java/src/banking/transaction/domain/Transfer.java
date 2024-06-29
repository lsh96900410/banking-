package src.banking.transaction.domain;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Entity
public class Transfer extends Transaction{

    @NotNull
    private String remitterName;

    @NotNull
    private String receiverName;

    @NotNull
    private String receiveAccountNumber;


}
