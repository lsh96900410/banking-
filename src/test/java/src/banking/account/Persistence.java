package src.banking.account;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

@DataJpaTest
public class Persistence {

    @Test
    @DisplayName("정상 계좌 생성")

    void createAccountOK (){
        // given
        /* 등록된 은행 타입 */


        // when
        /* create Query */


        // then
        /* 은행 종류 별 규칙에 따라 계좌 번호가 생성된다. */
    }

    @Test
    @DisplayName("계좌 생성 실패")
    void badBankTypeAtCreateAccount () {
        // given
        /* 등록되지 않은 은행 타입 */


        // when
        /* create Query  */


        // then
        /* 등록되지 않은 은행 타입 예외 상황 발생 */
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
