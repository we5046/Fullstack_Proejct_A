package org.scoula.security.config.account.dto;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.authentication.BadCredentialsException;

import javax.servlet.http.HttpServletRequest;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class LoginDTO {
    private String username;
    private String password;

    public static LoginDTO of(HttpServletRequest req) {
        ObjectMapper op = new ObjectMapper();
        try {
            return op.readValue(req.getInputStream(), LoginDTO.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw new BadCredentialsException("username or password invalid");
        }
    }
}
