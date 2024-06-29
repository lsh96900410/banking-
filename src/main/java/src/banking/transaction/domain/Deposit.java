package src.banking.transaction.domain;

import jakarta.persistence.Entity;
import lombok.Getter;

@Entity
@Getter
public class Deposit extends Transaction{

    private void deposit(long amount){

        super.setAmount( super.getAmount()+ amount);

    }
}
