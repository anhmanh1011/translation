package com.test.translation.mapper;

import com.test.translation.dto.TranslationDto;
import com.test.translation.entity.TranslationEntity;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface TranslationMapper {
    TranslationEntity toEntity(TranslationDto translationDto);

    TranslationDto toDto(TranslationEntity translationEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    TranslationEntity partialUpdate(TranslationDto translationDto, @MappingTarget TranslationEntity translationEntity);
}