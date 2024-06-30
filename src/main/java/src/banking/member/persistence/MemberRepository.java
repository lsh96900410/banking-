package src.banking.member.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import src.banking.common.exception.CustomException;
import src.banking.common.type.ExceptionType;
import src.banking.member.domain.Member;


public interface MemberRepository extends JpaRepository<Member,Long> {

    default Member findMemberById(Long id){
        return findById(id).orElseThrow(() -> new CustomException(ExceptionType.NOT_FOUND_MEMBER));
    }



}
