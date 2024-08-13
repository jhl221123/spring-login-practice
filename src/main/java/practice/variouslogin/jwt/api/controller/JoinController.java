package practice.variouslogin.jwt.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import practice.variouslogin.jwt.api.controller.request.JoinRequest;
import practice.variouslogin.jwt.api.service.JoinService;

@RestController
@RequiredArgsConstructor
public class JoinController {

	private final JoinService joinService;

	@PostMapping("/join")
	public String join(@RequestBody JoinRequest request) {
		joinService.join(request);
		return "ok";
	}
}
