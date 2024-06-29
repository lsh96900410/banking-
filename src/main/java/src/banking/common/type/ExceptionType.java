package src.banking.common.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ExceptionType {

    SELF_TRANSFER("자기 자신에게 송금할 수 없습니다."),

    NOT_ENOUGH_AMOUNT("금액이 충분하지 않습니다."),

    NOT_FOUND_MEMBER("존재하지 않는 회원입니다."),
    
    NOT_FOUND_ACCOUNT("존재하지 않는 계좌입니다.");

    private final String message;
}
