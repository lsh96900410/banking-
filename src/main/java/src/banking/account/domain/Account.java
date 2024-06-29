package src.banking.account.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import src.banking.common.BaseTimeEntity;
import src.banking.common.type.BankType;
import src.banking.common.constant.LiteralName;
import src.banking.member.domain.Member;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Account extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Enumerated(EnumType.STRING)
    private BankType bankType;

    @NotNull
    @Min(value = 0,message = LiteralName.MIN_AMOUNT)
    private Long amount;

    @NotNull
    @Column(unique = true)
    private String accountNumber;


    private String accountName;

    @ManyToOne
    private Member member;
}
