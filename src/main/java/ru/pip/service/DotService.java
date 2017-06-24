package ru.pip.service;

import ru.pip.entity.Dot;

import java.util.List;

public interface DotService {
    Dot addDot(Dot dot);
    List<Dot> getAll();
}
