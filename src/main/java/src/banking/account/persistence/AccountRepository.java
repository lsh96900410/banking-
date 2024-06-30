package src.banking.account.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import src.banking.account.domain.Account;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
