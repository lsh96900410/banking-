package src.banking.transaction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import src.banking.transaction.domain.Transaction;
import src.banking.transaction.persistence.TransactionRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class Persistence {

    @Autowired
    private TransactionRepository transactionRepository;


    @Test
    @DisplayName("거래 생성")
    void save(){
        // given
        /* 거래 데이터 */


        // when
        /* save Query */


        // then
        /* 정상 */
    }

}
