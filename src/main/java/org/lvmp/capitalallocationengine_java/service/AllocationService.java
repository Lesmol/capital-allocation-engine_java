package org.lvmp.capitalallocationengine_java.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AllocationService {

    public ResponseEntity<Void> addContribution() {
        return ResponseEntity.ok().build();
    }

    public ResponseEntity<Void> getPoolPayout() {
        return ResponseEntity.ok().build();
    }

    public ResponseEntity<Void> getAllocatedAssets() {
        return ResponseEntity.ok().build();
    }

    public ResponseEntity<Void> calculateMonthlyPayout() {
        return ResponseEntity.ok().build();
    }
}
