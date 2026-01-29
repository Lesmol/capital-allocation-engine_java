package org.lvmp.capitalallocationengine_java.controller;

import org.lvmp.capitalallocationengine_java.service.AllocationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/allocation-engine")
public class AllocationController {

    private final AllocationService allocationService;

    public AllocationController(AllocationService allocationService) {
        this.allocationService = allocationService;
    }

    @PostMapping("/contribution")
    public ResponseEntity<Void> addContribution() {
        return allocationService.addContribution();
    }

    @GetMapping("/pool-payout")
    public ResponseEntity<Void> getPoolPayout() {
        return allocationService.getPoolPayout();
    }

    @GetMapping("/allocated-assest")
    public ResponseEntity<Void> getAllocatedAssets() {
        return allocationService.getAllocatedAssets();
    }

    @GetMapping("/")
    public ResponseEntity<Void> calculateMonthlyPayout() {
        return allocationService.calculateMonthlyPayout();
    }

}
