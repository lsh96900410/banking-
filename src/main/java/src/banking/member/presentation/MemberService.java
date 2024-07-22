package src.banking.member.presentation;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import src.banking.common.exception.CustomException;
import static src.banking.common.type.ExceptionType.*;
import src.banking.member.domain.Member;
import src.banking.member.dto.JoinMember;
import src.banking.member.persistence.MemberRepository;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public void join(final JoinMember joinMember) {

        try {
            memberRepository.findByLoginId(joinMember.username());

            Member newMember = Member.builder().joinMember(joinMember).build();

            memberRepository.save(newMember);

        } catch (CustomException customException) {

        }

    }

    /* Return Dto */
    public void findMember(Long id){
        memberRepository.findById(id).orElseThrow(
                () -> new CustomException(NOT_FOUND_MEMBER));

    }
}
