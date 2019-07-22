package net.frju.flym.data.utils;

import androidx.room.TypeConverter;

import java.time.LocalDateTime;

class LocalDateTimeConverter {

    @TypeConverter
    fun fromString(string: String) : LocalDateTime {
        if (string == null) {
            return LocalDateTime.MIN
        } else {
            return LocalDateTime.parse(string)
        }
        return LocalDateTime.MIN
    }

    @TypeConverter
    fun fromLocalDateTime(localDateTime: LocalDateTime) : String {
        if (localDateTime == null) {
            return ""
        } else {
            return localDateTime.toString()
        }
    }
}