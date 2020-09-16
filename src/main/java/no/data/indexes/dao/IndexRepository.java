package no.data.indexes.dao;

import no.data.indexes.model.Index;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IndexRepository extends CrudRepository<Index, Long> {
    public List<Index> findByLevel(int level);
}
