package src.banking.transaction.domain;

import jakarta.persistence.Entity;

@Entity
public class Withdraw extends Transaction{


    private void withdraw(long amount){
        super.setAmount( super.getAmount() - amount);
    }
}
