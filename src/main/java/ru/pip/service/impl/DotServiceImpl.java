package ru.pip.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.pip.entity.Dot;
import ru.pip.repository.DotRepository;
import ru.pip.service.DotService;

import java.util.List;


@Service
public class DotServiceImpl implements DotService {

    @Autowired
    DotRepository dotRepository;

    public Dot addDot(Dot dot) {
        Dot savedDot = dotRepository.saveAndFlush(dot);

        return savedDot;
    }

    public List<Dot> getAll() {
        return dotRepository.findAll();
    }
}
