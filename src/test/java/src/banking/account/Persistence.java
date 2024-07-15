package src.banking.account;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import src.banking.account.domain.Account;
import src.banking.account.dto.CreateAccount;
import src.banking.account.persistence.AccountRepository;
import src.banking.common.type.BankType;
import src.banking.member.domain.Member;
import src.banking.member.dto.JoinMember;
import src.banking.member.persistence.MemberRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class Persistence {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    @DisplayName("정상 계좌 생성")

    void createAccountOK (){
        // given
        /* 등록된 은행 타입 */
        CreateAccount newAccount = new CreateAccount(BankType.기업은행,10000L,"테스트계좌");
        JoinMember joinMemberData = new JoinMember("테스트1","테스트 회원");
        Member joinMember = new Member(joinMemberData);
        Account account = new Account(newAccount,joinMember);

        Member save = memberRepository.save(joinMember);

        //entityManager.persist(save);
        // when
        /* create Query */
        Account saveAcc = accountRepository.save(account);

        //entityManager.persist(saveAcc);

        // then

        assertThat(saveAcc.getBankType()).isEqualTo(newAccount.bankType());
        assertThat(saveAcc.getAccountName()).isEqualTo(newAccount.accountName());
        assertThat(saveAcc.getMember()).isEqualTo(joinMember);
        assertThat(saveAcc.getAmount()).isEqualTo(newAccount.amount());
        assertThat(saveAcc.getMember().getUsername()).isEqualTo(joinMember.getUsername());
        assertThat(saveAcc.getMember().getNickname()).isEqualTo(joinMember.getNickname());


    }
    
    @Test
    @DisplayName("중복 계좌 체크")
    void existAccountNumber(){
        // given
        /* 계좌 번호 */


        // when
        /* find Query(Count + Limit) By 계좌번호 */


        // then
        /* 존재여부 판단 : Exist Method X, Count + Limit Query 만들기 */
    }

    @Test
    @DisplayName("회원 별 계좌 리스트")
    void findAccountByMember(){
        // given
        /* 회원 아이디 */


        // when
        /* find Query By 회원 아이디 */


        // then
        /* List Collection Result */
    }

    @Test
    @DisplayName("계좌 삭제")
    void delete(){
        // given
        /* 계좌 아이디  */

        // when
        /* delete Query By 계좌번호 */


        // then
        /* ?..? */
    }

    @Test
    @DisplayName("계좌 비밀번호 변경")
    void changePs(){
        // given
        /* 변경 비밀번호 */


        // when
        /* update Query By 비밀번호 */


        // then
        /* 변경 완료 */
    }
}
