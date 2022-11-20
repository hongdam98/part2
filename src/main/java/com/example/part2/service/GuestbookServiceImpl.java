package com.example.part2.service;

import com.example.part2.dto.GuestbookDTO;
import com.example.part2.entity.Guestbook;
import com.example.part2.repository.GuestbookRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor //의존성 자동 투입
public class GuestbookServiceImpl implements GuestbookService{

    private final GuestbookRepository repository;
    @Override
    public Long register(GuestbookDTO dto) {

        log.info("DTO-----------------");
        log.info(dto);

        Guestbook entity = dtoToEntity(dto);

        log.info(entity);

        repository.save(entity);

        return entity.getGno();
    }
}
