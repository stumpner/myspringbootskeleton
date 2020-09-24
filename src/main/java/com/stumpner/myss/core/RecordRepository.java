package com.stumpner.myss.core;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RecordRepository extends MongoRepository<RecordEntry, String> {


}
