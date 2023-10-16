package com.test.translation.service.impl;

import com.test.translation.dto.TranslationDto;
import com.test.translation.entity.TranslationEntity;
import com.test.translation.mapper.TranslationMapper;
import com.test.translation.repository.TranslationRepository;
import com.test.translation.service.TranslationService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;



@Service
@AllArgsConstructor
public class TranslationServiceImpl implements TranslationService {

    private final TranslationRepository translationRepository;
    private final TranslationMapper translationMapper;


    @Override
    public Page<TranslationDto> search(Pageable pageable) {
        Page<TranslationEntity> all = translationRepository.findAll(pageable);
        return all.map(translationMapper::toDto);
    }
}
