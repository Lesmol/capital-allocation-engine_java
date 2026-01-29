package org.lvmp.capitalallocationengine_java.controller;

import org.lvmp.capitalallocationengine_java.dto.UserRequest;
import org.lvmp.capitalallocationengine_java.model.User;
import org.lvmp.capitalallocationengine_java.service.OriginationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/origination")
public class OriginationController {

    private final OriginationService originationService;

    public OriginationController(OriginationService originationService) {
        this.originationService = originationService;
    }

    @PostMapping("/create-user")
    public ResponseEntity<User> createUser(@RequestBody UserRequest request) {
        return originationService.createUser(request);
    }

    @PostMapping("/join-pool")
    public ResponseEntity<Void> joinPool() {
        return originationService.joinPool();
    }

    @PostMapping("/create-pool")
    public ResponseEntity<Void> createPool() {
        return originationService.createPool();
    }
}
