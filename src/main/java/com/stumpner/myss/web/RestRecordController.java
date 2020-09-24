package com.stumpner.myss.web;

import com.stumpner.myss.core.RecordEntry;
import com.stumpner.myss.core.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RestRecordController {

    @Autowired
    private RecordRepository repository;

    @GetMapping("/rest/records")
    List<RecordEntry> records() {
        return repository.findAll();
    }

    @GetMapping(value = "/rest/records/{id}")
    public RecordEntry id(@PathVariable("id") String id) {

        Optional<RecordEntry> o = repository.findById(id);

        if (o.isEmpty()) { return null; }
        else {
            return o.get();
        }
    }
}
