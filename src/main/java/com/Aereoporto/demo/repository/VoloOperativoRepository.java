package com.Aereoporto.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.Aereoporto.demo.model.VoloOperativo;

public interface VoloOperativoRepository extends MongoRepository<VoloOperativo, String> {
}
