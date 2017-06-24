package ru.pip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.pip.entity.Dot;

public interface DotRepository extends JpaRepository<Dot, Long>{
}
