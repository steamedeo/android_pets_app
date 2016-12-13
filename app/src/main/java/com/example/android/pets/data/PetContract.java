package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by stefano on 12/12/2016.
 */

public final class PetContract {

    //constructor
    private PetContract(){};

    public static class PetEntry implements BaseColumns{

        //table
        public static final String TABLE_NAME = "pets";

        //fields
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_GENDER = "gender";
        public static final String COLUMN_PET_WEIGHT = "weight";

        //values for gender
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
        public static final int GENDER_UNKNOWN = 0;


    }

}
