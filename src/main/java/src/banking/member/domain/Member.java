package src.banking.member.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import src.banking.account.domain.Account;
import src.banking.common.BaseTimeEntity;
import src.banking.member.dto.JoinMember;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //private String password;

    private String username;

    private String nickname;

     @OneToMany(mappedBy = "member")
    private List<Account> accounts=new ArrayList<>();

    @Builder
    public Member(JoinMember joinMember){
        this.nickname= joinMember.nickName();;
        this.username= joinMember.username();
    }
}
