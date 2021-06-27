package com.atilsamancioglu.flavordemo.model

import androidx.annotation.Keep

//@Keep -> tell proguard not to obfuscate this
data class SampleModel(val id: Int, val name : String)
