package com.test.translation.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * DTO for {@link com.test.translation.entity.TranslationEntity}
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record TranslationDto(Long id, String text, Long translationId, String translateText,
                             String audioUrl) implements Serializable {
}