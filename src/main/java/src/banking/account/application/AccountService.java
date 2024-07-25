package src.banking.account.application;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import src.banking.account.domain.Account;
import src.banking.account.dto.CreateAccount;
import src.banking.account.persistence.AccountRepository;
import src.banking.account.vo.ChangeAccountName;
import src.banking.common.exception.CustomException;
import src.banking.common.type.ExceptionType;

import static src.banking.common.type.ExceptionType.*;

@Service
@Slf4j
@RequiredArgsConstructor
public class AccountService {
    private final AccountRepository accountRepository;


    @Transactional(rollbackOn = ExceptionType.class)
    public void createAccount(final CreateAccount createAccount){

        Account account = Account.builder().createAccount(createAccount).build();

        accountRepository.findByAccountNumber(account.getAccountNumber())
                .orElseThrow(() -> new CustomException(EXIST_ACCOUNT_NUMBER));

        accountRepository.save(account);

    }

    public void find(final Long accountId){
        final Account findAccount = findAccount(accountId);

        // 레코드 클래스 만들기
    }

    /* 더티 체킹 테스팅 */
    public boolean changAccountName(final ChangeAccountName newNaming){

        try {
            final Account findAccount = findAccount(newNaming.accountId());

            return findAccount.changeAccountName(newNaming.accountName());


        }catch (CustomException exception){

            return false;
        }

    }





    private Account findAccount(Long id){
        return accountRepository.findById(id)
                .orElseThrow(() -> new CustomException(NOT_FOUND_ACCOUNT));

    }
}
