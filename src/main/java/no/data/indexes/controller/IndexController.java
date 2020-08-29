package no.data.indexes.controller;

import no.data.indexes.dao.IndexRepository;
import no.data.indexes.model.Index;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {

    @Autowired
    private IndexRepository repository;

    @GetMapping
    public List<Index> getIndexes(){
        return (List<Index>) repository.findAll();
    }
}
