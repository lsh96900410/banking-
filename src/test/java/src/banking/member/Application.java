package src.banking.member;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Application {

    @Test
    @DisplayName("회원가입")
    void joinMember(){
        // given
        /* 회원 정보 */


        // when
        /* 회원 가입 로직 실행 */


        // then
        /* 정상 */
    }
    
    @Test
    @DisplayName("회원가입 실패 Case : 중복 존재")
    void joinException(){
        // given
        /* 회원 정보 */


        // when
        /* 회원 가입 로직 실행  */


        // then
        /* 중복 회원 예외 상황 발생 */
    }

    @Test
    @DisplayName("회원 탈퇴")
    void delete(){
        // given
        /* 회원 아이디 */


        // when
        /* 삭제 진행 */


        // then
        /* 정상 */
    }

    @Test
    @DisplayName("회원 탈퇴 실패")
    void badDelete(){
        // given
        /* 회원 아이디 */


        // when
        /* 삭제 진행 */


        // then
        /* 존재하지 않는 아이디 예외 상황 발생  */
    }

    @Test
    @DisplayName("회원 조회")
    void findMember(){
        // given
        /* 회원 아이디 */


        // when
        /* 조회 로직 */


        // then
        /* 정상 */
    }

    @Test
    @DisplayName("회원 조회 실패 ")
    void badFind(){
        // given
        /* 회원 아이디 */


        // when
        /* 조회 로직 */


        // then
        /* 존재하지 않는 회원 예외 발생 */
    }

    @Test
    @DisplayName("목록 조회")
    void list(){
        // given
        /* not */


        // when
        /* findAll */


        // then
        /* 정상 */
    }

}
