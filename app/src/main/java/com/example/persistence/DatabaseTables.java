package com.example.persistence;

class DatabaseTables {

    static class personInfo {

        static final String TABLE_NAME = "information";
        static final String COLUMN_NAME_GENDER = "gender";
        static final String COLUMN_NAME_NAME = "name";
        static final String COLUMN_NAME_AGE = "age";

    }

    static final String SQL_CREATE_TABLE_PERSON =

            "CREATE TABLE " + personInfo.TABLE_NAME + " (" +
                    personInfo.COLUMN_NAME_GENDER + " TEXT ," +
                    personInfo.COLUMN_NAME_NAME + " TEXT ," +
                    personInfo.COLUMN_NAME_AGE + " INT)";

    static final String SQL_DELETE_TABLE_PERSON =
            // "DROP TABLE IF EXISTS mountain"
            "DROP TABLE IF EXISTS " + personInfo.TABLE_NAME;

}
