package com.example.profile.service;

import com.example.profile.mapper.Mapper;
import com.example.profile.payload.request.UpdateRequest;
import com.example.profile.repository.ProfileRepository;
import org.springframework.stereotype.Service;

@Service
public class ProfileServiceImpl implements ProfileService {
    private final ProfileRepository profileRepository;
    private final Mapper mapper;

    public ProfileServiceImpl(ProfileRepository profileRepository, Mapper mapper) {
        this.profileRepository = profileRepository;
        this.mapper = mapper;
    }

    @Override
    public void update(UpdateRequest updateRequest) {
        this.profileRepository.save(this.mapper.map(updateRequest));
    }
}
