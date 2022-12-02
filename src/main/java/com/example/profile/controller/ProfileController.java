package com.example.profile.controller;

import com.example.profile.payload.request.SaveRequest;
import com.example.profile.payload.request.UpdateRequest;
import com.example.profile.service.ProfileService;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @PatchMapping("/update")
    public void update(@RequestBody UpdateRequest request) {
        this.profileService.update(request);
    }
}
