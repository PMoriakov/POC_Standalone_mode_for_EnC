package com.protentecs.enc.db;

import org.springframework.stereotype.Component;

/**
 *
 * @author Pavel Moriakov
 * @since 22/12/2022
 */
@Component
public class MySqlDatabaseImpl implements MySqlDatabase {

    @Override
    public void readFromDb(String tableName) {
        System.out.println("Entity was loaded from " + tableName);
    }
}
