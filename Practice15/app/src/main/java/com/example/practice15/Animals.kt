package com.example.practice15

import android.os.Parcel
import android.os.Parcelable

class Animals() : Parcelable {
    private var breed: String = ""
    private var date: Int = 0
    constructor(parcel: Parcel) : this() {
        breed = parcel.readString().toString()
        date = parcel.readInt()
    }
    companion object CREATOR : Parcelable.Creator<Animals> {
        override fun createFromParcel(parcel: Parcel): Animals {
            return Animals(parcel)
        }
        override fun newArray(size: Int): Array<Animals?> {
            return arrayOfNulls(size)
        }
    }
    constructor(_breed: String, _date: Int) : this() {
        breed = _breed
        date = _date
    }
    fun setBreed(_breed: String){
        breed = _breed
    }
    fun getBreed(): String {
        return breed
    }
    fun setDate(_date: Int){
        date = _date
    }
    fun getDate(): Int {
        return date
    }
    override fun describeContents(): Int {
        return 0
    }
    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeString(breed)
        dest?.writeInt(date)
    }
}
