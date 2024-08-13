package practice.variouslogin.jwt.api.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import practice.variouslogin.jwt.api.controller.request.JoinRequest;
import practice.variouslogin.jwt.domain.entity.User;
import practice.variouslogin.jwt.domain.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class JoinService {

	private final UserRepository userRepository;
	private final BCryptPasswordEncoder passwordEncoder;

	public void join(JoinRequest request) {
		String username = request.getUsername();
		String password = request.getPassword();

		Boolean isExist = userRepository.existsByName(username);

		if(isExist) {
			throw new RuntimeException("중복된 회원 요청");
		}

		String encodedPassword = passwordEncoder.encode(password);
		User user = User.builder()
			.name(username)
			.password(encodedPassword)
			.role("ROLE_ADMIN")
			.build();

		userRepository.save(user);
	}
}
