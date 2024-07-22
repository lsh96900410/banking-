package src.banking.member.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import src.banking.common.exception.CustomException;
import static src.banking.common.type.ExceptionType.*;
import src.banking.member.domain.Member;

import java.util.Optional;


public interface MemberRepository extends JpaRepository<Member,Long> {

    Optional<Member> findByUsername(String username);

    default Member findMemberById(Long id){
        return findById(id).orElseThrow(() -> new CustomException(NOT_FOUND_MEMBER));
    }

    default Member findByLoginId(String username){
        return findByUsername(username).orElseThrow(() -> new CustomException(EXIST_MEMBER));
    }

}
