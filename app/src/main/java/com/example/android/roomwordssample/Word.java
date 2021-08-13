package com.example.android.roomwordssample;

import androidx.annotation.NonNull;
import androidx.room.*;

@Entity(tableName="word_table")
public class Word {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "word")
    private String mWord;

    public Word(@NonNull String mWord) {
        this.mWord = mWord;
    }

    public String getWord(){return this.mWord;}

}
