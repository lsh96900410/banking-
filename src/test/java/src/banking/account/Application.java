package src.banking.account;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Application {


    @Test
    @DisplayName("정상 계좌 생성")
    void createAccountOK (){
        // given
        /* 등록된 은행 타입 */


        // when
        /* 계좌 생성 로직 */


        // then
        /* 은행 종류 별 규칙에 따라 계좌 번호가 생성된다. */
    }

    @Test
    @DisplayName("계좌 생성 실패 CASE : 등록되지 않은 은행")
    void badBankTypeAtCreateAccount () {
        // given
        /* 등록되지 않은 은행 타입 */


        // when
        /* 계좌 생성 로직 */


        // then
        /* 등록되지 않은 은행 타입 예외 상황 발생 */
    }

    @Test
    @DisplayName("계좌 생성 실패 CASE : 계좌 번호 중복 상황")
    void existAccNumAtCreateAccount () {
        // given
        /* 등록된 은행 타입 */


        // when
        /* 계좌 생성 로직 */


        // then
        /* 중복된 번호가 존재하여 생성 실패 예외 발생 */
    }


    @Test
    @DisplayName("회원 별 계좌 리스트")
    void findAccountByMember(){
        // given
        /* 회원 PK? 아이디?  */


        // when
        /* 회원 아이디로 계좌 찾기 */


        // then
        /* 데이터 더미  */
    }

    @Test
    @DisplayName("회원 별 계좌 리스트")
    void findAccountByMemberAtNotExist(){
        // given
        /* 회원 PK? 아이디?  */


        // when
        /* 회원 아이디로 계좌 찾기 */


        // then
        /* 빈 객체  */
    }

    @Test
    @DisplayName("회원 별 계좌 리스트 실패 CASE : 존재하지 않는 회원")
    void findAccountByNotExistMember(){
        // given
        /* 회원 PK? 아이디? */


        // when
        /* 회원 아이디로 계좌 찾기 */


        // then
        /* 존재하지 않는 회원으로 예외 상황 발생  */
    }
    @Test
    @DisplayName("계좌 삭제")
    void delete(){
        // given
        /* 계좌 아이디  */


        // when
        /* 삭제 로직  */


        // then
        /* 삭제 완료 !  */
    }

    @Test
    @DisplayName("계좌 비밀번호 변경")
    void changePsOk(){
        // given
        /* 계좌 아이디, 변경 비밀번호 */


        // when
        /* 변경 로직 */


        // then
        /* 변경 완료 */
    }

    @Test
    @DisplayName("계좌 비밀번호 변경 실패 : 계좌 미존재")
    void changePsBad1(){
        // given
        /* 변경 비밀번호 */


        // when
        /* 변경 로직 */


        // then
        /* 변경 계좌가 없는 예외 상황 */
    }

    @Test
    @DisplayName("계좌 비밀번호 변경 실패 : 이전 번호와 동일한 비밀번호")
    void changePsBad2(){
        // given
        /* 변경 비밀번호 */


        // when
        /* 변경 로직 */


        // then
        /* 이전 비밀번호와 동일한 비밀번호 변경 요청 예외 상황 */
    }
}
