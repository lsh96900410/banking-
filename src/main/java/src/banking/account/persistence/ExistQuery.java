package src.banking.account.persistence;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import static src.banking.account.domain.QAccount.*;


@Repository
@RequiredArgsConstructor
public class ExistQuery {

    private final JPAQueryFactory queryFactory;

    // AccountNumber Class
    public Boolean existMember(){
        Integer result = queryFactory.selectOne().from(account).fetchFirst();

        return  result != null ;
    }
}
