package src.banking.member.application;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import src.banking.common.exception.CustomException;
import src.banking.member.domain.Member;
import src.banking.member.dto.JoinMember;
import src.banking.member.persistence.MemberRepository;

import static src.banking.common.type.ExceptionType.*;

@Service
@Slf4j
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;


    @Transactional
    public void join(final JoinMember joinMember) {

        try {
            loginIdCheck(joinMember.username());

            Member newMember = Member.builder().joinMember(joinMember).build();

            memberRepository.save(newMember);

        } catch (CustomException customException) {


        } finally {


        }

    }

    /* Return Dto */
    public void findMember(Long id){
        memberRepository.findById(id).orElseThrow(
                () -> new CustomException(NOT_FOUND_MEMBER));

    }




    private void loginIdCheck(String loginId){
        memberRepository.findByLoginId(loginId);
    }

}
