package src.banking.transaction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Application {

    @Test
    @DisplayName("송금")
    void transfer(){
        // given
        /* 받는 회원, 보내는 회원, 금액 등 데이터 */


        // when
        /* 생성 로직 */


        // then
        /* 성공 */
    }

    
    @Test
    @DisplayName("송금 실패")
    void badTransfer1(){
        // given
        /* 받는 회원, 보내는 회원, 금액 등 데이터 */


        // when
        /* 생성 로직 */


        // then
        /* 보내는 사람 계좌 금액 부족 예외 상황 */
    }

    
    @Test
    @DisplayName("송금 실패")
    void badTransfer2(){
        // given
        /* 받는 회원, 보내는 회원, 금액 등 데이터 */


        // when
        /* 생성 로직 */


        // then
        /* 송금 금액 0원 이하 예외 상황 */
    }

    @Test
    @DisplayName("송금 실패")
    void badTransfer3(){
        // given
        /* 받는 회원, 보내는 회원, 금액 등 데이터 */


        // when
        /* 생성 로직 */


        // then
        /* 보내는 회원 미존재 예외 상황 */
    }

    
    @Test
    @DisplayName("송금 실패")
    void badTransfer4(){
        // given
        /* 받는 회원, 보내는 회원, 금액 등 데이터 */


        // when
        /* 생성 로직 */


        // then
        /* 받는 계좌 및 회원 미존재 예외 상황 */
    }
    
    
    @Test
    @DisplayName("송금")
    void transferByTransaction(){
        // given
        /* 받는 회원, 보내는 회원, 금액 등 데이터 */


        // when
        /* 생성 로직 */


        // then
        /* 격리 수준에 따라 분리 */
    }

    /* ------------------------------------------------------------------------------------------ */

    @Test
    @DisplayName("입금")
    void deposit(){
        // given
        /* 회원 정보, 계좌 정보, 금액 */


        // when
        /* 생성 로직 */


        // then
        /* 성공 */
    }

    
    @Test
    @DisplayName("입금 실패")
    void badDeposit1(){
        // given
        /* 회원 정보, 계좌 정보, 금액 */


        // when
        /* 생성 로직 */


        // then
        /* 입금 금액 0원 이하 예외 상황 */
    }

    @Test
    @DisplayName("입금 실패")
    void badDeposit2(){
        // given
        /* 회원 정보, 계좌 정보, 금액 */


        // when
        /* 생성 로직 */


        // then
        /* 입금 계좌 정보 존재 X 예외 상황 */
    }


    @Test
    @DisplayName("입금")
    void depositByTransaction(){
        // given
        /* 회원 정보, 계좌 정보, 금액 */


        // when
        /* 생성 로직 */


        // then
        /* 격리 수준에 따라 분리 */
    }

    /* ------------------------------------------------------------------------------------------ */

    @Test
    @DisplayName("출금")
    void withdraw(){
        // given
        /* 회원 정보, 계좌 정보, 금액 */


        // when
        /* 생성 로직 */


        // then
        /* 정상 */
    }


    @Test
    @DisplayName("출금 실패")
    void badWithdraw1(){
        // given
        /* 회원 정보, 계좌 정보, 금액 */


        // when
        /* 생성 로직 */


        // then
        /* 계좌 및 회원 정보 없는 예외 발생 */
    }


    @Test
    @DisplayName("출금 실패")
    void badWithdraw2(){
        // given
        /* 회원 정보, 계좌 정보, 금액 */


        // when
        /* 생성 로직 */


        // then
        /* 계좌 잔액 부족 예외 발생 */
    }


    @Test
    @DisplayName("출금 실패")
    void badWithdraw3(){
        // given
        /* 회원 정보, 계좌 정보, 금액 */


        // when
        /* 생성 로직 */


        // then
        /* 해당 은행 점검 시간 예외 발생 */
    }



    @Test
    @DisplayName("출금")
    void withdrawByTransaction(){
        // given
        /* 회원 정보, 계좌 정보, 금액 */


        // when
        /* 생성 로직 */


        // then
        /* 격리 수준에 따라 분리  */
    }

}
