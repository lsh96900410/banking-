package src.banking.account.dto;

import lombok.Getter;
import src.banking.common.type.BankType;

public record CreateAccount(BankType bankType, Long amount, String accountName) {
}
