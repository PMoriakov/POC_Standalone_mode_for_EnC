package com.protentecs.enc.service;

import com.protentecs.enc.db.MySqlDatabaseImpl;
import com.protentecs.enc.validator.SchemaValidator;
import org.springframework.stereotype.Service;

/**
 * @author Pavel Moriakov
 * @since 22/12/2022
 */
@Service
public class EncLoadingService {

    private SchemaValidator schemaValidator;
    private MySqlDatabaseImpl database;

    void load(){
        database.readFromDb("enc_management");
        schemaValidator.validate();
    }
}
