package com.example.profile.mapper;

import com.example.profile.entity.Profile;
import com.example.profile.payload.request.ProfileDataConsumerRequest;
import com.example.profile.payload.request.UpdateRequest;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@org.mapstruct.Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface Mapper {
    @Mappings({@Mapping(source = "request.personalAddress", target = "personalAddress")})
    Profile map(UpdateRequest request);

    Profile map(ProfileDataConsumerRequest request);
}
