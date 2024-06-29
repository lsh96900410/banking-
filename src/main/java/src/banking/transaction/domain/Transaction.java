package src.banking.transaction.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import src.banking.account.domain.Account;
import src.banking.common.BaseTimeEntity;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Inheritance(strategy = InheritanceType.JOINED)
@Setter(AccessLevel.PROTECTED)
public abstract class Transaction extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Account account;

    private Long amount;

    private String withDrawerName;


    private void deposit(long amount){
        this.amount = this.amount-amount;
    }
}
