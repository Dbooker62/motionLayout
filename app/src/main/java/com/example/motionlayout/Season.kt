package com.example.motionlayout

import android.os.Parcel
import android.os.Parcelable

data class Season(
    val name: String,
    val totalEpisodes: Int,
    val reviewCount: Int,
    val numberOfSeasons: Int
) : Parcelable {


    constructor(parcel: Parcel) : this(
        parcel.readString() ?: "",
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeInt(totalEpisodes)
        parcel.writeInt(reviewCount)
        parcel.writeInt(numberOfSeasons)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Season> {
        override fun createFromParcel(parcel: Parcel): Season {
            return Season(parcel)
        }

        override fun newArray(size: Int): Array<Season?> {
            return arrayOfNulls(size)
        }
    }
}
