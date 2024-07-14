package src.banking.transaction.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import src.banking.transaction.domain.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {
}
