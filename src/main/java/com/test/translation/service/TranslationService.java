package com.test.translation.service;


import com.test.translation.dto.TranslationDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface TranslationService {
    Page<TranslationDto> search(Pageable pageable);
}
