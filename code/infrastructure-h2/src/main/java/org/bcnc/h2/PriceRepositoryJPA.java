package org.bcnc.h2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

interface PriceRepositoryJPA extends JpaRepository<PriceH2, Integer> {
}
