package com.example.themedallist

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Olympian(val name: String, val medals: String): Parcelable{
  }