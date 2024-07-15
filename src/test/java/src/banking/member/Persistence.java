package src.banking.member;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import src.banking.member.domain.Member;
import src.banking.member.dto.JoinMember;
import src.banking.member.persistence.MemberRepository;

import java.util.List;
import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class Persistence {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    @DisplayName("회원가입 Query")
    void joinMember(){
        // given
        /* 회원 정보 */
        JoinMember joinMemberData = new JoinMember("테스트","테스트");
        Member member = Member.builder().joinMember(joinMemberData).build();
        
        // when
        /* Save Query */
        Member saveMember = memberRepository.save(member);
        
        // then
        /* 정상 */
        assertThat(saveMember.getUsername()).isEqualTo(member.getUsername());
        assertThat(saveMember.getNickname()).isEqualTo(member.getNickname());

    }
    
    @Test
    @DisplayName("회원 탈퇴")
    void delete(){
        // given
        /* 회원 아이디 */
        JoinMember joinMemberData = new JoinMember("테스트","테스트");
        Member member = Member.builder().joinMember(joinMemberData).build();
        Member saveMember = memberRepository.save(member);

        long deleteMemberId = saveMember.getId();

        Member deleteMember = memberRepository.findMemberById(deleteMemberId);

        // when
        /* delete Query */
        memberRepository.delete(deleteMember);

        // then
        /* 정상 */
    }

    @Test
    @DisplayName("회원 조회")
    void findMember(){
        // given
        Member saveMember = memberRepository.save(new Member(new JoinMember("테스트 U", "테스트 N")));


        // when
        Optional<Member> findMember = memberRepository.findById(saveMember.getId());


        // then
        assertThat(findMember.get().getNickname()).isEqualTo(saveMember.getNickname());
        assertThat(findMember.get().getUsername()).isEqualTo(saveMember.getUsername());

    }

    @Test
    @DisplayName("목록 조회")
    void list(){
        // given


        // when
        List<Member> all = memberRepository.findAll();


        // then


        assertThat(all.size()).isEqualTo(0);
    }

    @Test
    @DisplayName("중복 확인 Query")
    void existMember(){
        // given
        /* 회원 아이디 */


        // when
        /* exist Query */


        // then
        /* 정상 */
    }
}
