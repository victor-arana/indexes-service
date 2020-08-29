package no.data.indexes.dao;

import no.data.indexes.model.Index;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndexRepository extends CrudRepository<Index, Long> { }
