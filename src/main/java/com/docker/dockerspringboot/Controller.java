package com.docker.dockerspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class Controller {

	@GetMapping("/initial")
	public InvitationDto getInvitation( @RequestParam (name="", required = false)String name  ) {
		if (name==null) {
			return new InvitationDto();
		}
		InvitationDto invitationDto = new InvitationDto();
	invitationDto.setInvitation(invitationDto.getInvitation()+" "+name);
	return invitationDto;
	}


}
