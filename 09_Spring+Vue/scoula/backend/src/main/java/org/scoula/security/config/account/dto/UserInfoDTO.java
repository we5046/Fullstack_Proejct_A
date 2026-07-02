package org.scoula.security.config.account.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.scoula.security.account.domain.AuthVO;
import org.scoula.security.account.domain.MemberVO;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoDTO {
    private String username;
    private String email;
    List<String> roles;

    public static UserInfoDTO of(MemberVO member) {
        return new UserInfoDTO(
                member.getUsername(),
                member.getEmail(),
                member.getAuthList().stream()
//                        .map(a-> a.getAuth())
                        .map(AuthVO::getAuth)
                        .toList()
        );
    }
}
