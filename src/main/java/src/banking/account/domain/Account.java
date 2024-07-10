package src.banking.account.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import src.banking.account.dto.CreateAccount;
import src.banking.common.BaseTimeEntity;
import static src.banking.common.constant.NumberName.*;

import src.banking.common.exception.CustomException;
import src.banking.common.type.BankType;
import src.banking.common.constant.LiteralName;
import src.banking.member.domain.Member;

import javax.print.attribute.standard.PrinterMakeAndModel;
import java.util.Random;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
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
    @Embedded
    private AccountNumber accountNumber;


    private String accountName;

    @ManyToOne
    private Member member;

    public Account(CreateAccount createAccount,Member member){
        this.bankType = createAccount.bankType();
        this.amount=createAccount.amount();
        this.accountNumber = new AccountNumber(createAccount.bankType());
        this.accountName= createAccount.accountName();
        this.member=member;
    }

    @Embeddable
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    private class AccountNumber{
        private String accountNumber;
        private short count = 0;
        private AccountNumber(BankType type) {
            this.accountNumber = createAccountNum(bankUniqueNum(type));
        }

        private String bankUniqueNum(BankType type){

            switch (type){
                case 기업은행 -> {return IBK_UNIQUE_NUMBER;}
                case 농협은행 -> {return NH_UNIQUE_NUMBER;}
                case 카카오뱅크 -> {return KAKAO_UNIQUE_NUMBER;}
            }

            return NOT_EXIST_BANK_TYPE;
        }

        private String createAccountNum(String uniqueNum){
            Random random =new Random();
            String num = "";

            for (int i = 0; i < 5 ; i++){ num += Integer.toString(random.nextInt(9)); }
            count++;

            return uniqueNum + "-" + String.format("$04d",count) + "-" + num ;

        }
    }

}
