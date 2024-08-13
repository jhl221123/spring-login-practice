package practice.variouslogin.jwt.api.controller.request;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class JoinRequest {

	private String username;
	private String password;
}
