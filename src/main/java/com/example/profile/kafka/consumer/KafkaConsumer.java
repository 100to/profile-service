package com.example.profile.kafka.consumer;

import com.example.profile.mapper.Mapper;
import com.example.profile.payload.request.ProfileDataConsumerRequest;
import com.example.profile.repository.ProfileRepository;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    private final ProfileRepository profileRepository;
    private final Mapper mapper;

    public KafkaConsumer(ProfileRepository profileRepository, Mapper mapper) {
        this.profileRepository = profileRepository;
        this.mapper = mapper;
    }

    @KafkaListener(topics = "PROFILE", groupId = "group-id")
    public void consume(ProfileDataConsumerRequest request) {
        this.profileRepository.save(this.mapper.map(request));
    }
}
