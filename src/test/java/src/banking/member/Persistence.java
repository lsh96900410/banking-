package src.banking.member;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class Persistence {

    @Test
    @DisplayName("회원가입 Query")
    void joinMember(){
        // given
        /* 회원 정보 */
        
        
        // when
        /* Save Query */
    
        
        // then
        /* 정상 */
    }
    
    @Test
    @DisplayName("회원 탈퇴")
    void delete(){
        // given
        /* 회원 아이디 */


        // when
        /* delete Query */


        // then
        /* 정상 */
    }

    @Test
    @DisplayName("회원 조회")
    void findMember(){
        // given
        /* 회원 아이디 */


        // when
        /* find Query */


        // then
        /* 정상 */
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
