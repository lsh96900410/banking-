package src.banking.account.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import src.banking.account.domain.Account;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account,Long> {

    <T>  Optional<Account>findByAccountNumber(T accountNumber);
}
