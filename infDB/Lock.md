DB 락 - 개념이해
세션 A, B가 존재하는 상황에서 세션 A가 트랜잭션을 시작하고 데이터를 수정한다.
이 과정에서 커밋을 수행하지 않은 데이터에 세션 B가 동시에 데이터를 수정하게되면 트랜잭션의 원자성이 깨지는 문제가 발생한다.
이에 더해, 만약 세션 A의 트랜잭션에서 특정 이유로 롤백을 진행했을 때, 세션 B는 첫 작업부터 잘못된 데이터에 대한 작업을 진행하게되는 것이다.

이러한 문제를 방지하려면, 하나의 세션이 트랜잭션을 시작하고 데이터를 수정하는 작업에서
커밋, 롤백 전까지 다른 세션에서 해당 데이터를 수정할 수 없게 막아야 한다.



