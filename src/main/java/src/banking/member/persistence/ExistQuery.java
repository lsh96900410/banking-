package src.banking.member.persistence;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import static src.banking.member.domain.QMember.*;

@Repository
@RequiredArgsConstructor
public class ExistQuery {

    private final JPAQueryFactory queryFactory;

    public Boolean existMember(String userName){
        Integer result = queryFactory.selectOne().from(member).where(member.username.eq(userName)).fetchFirst();

        return  result != null ;
    }
}
