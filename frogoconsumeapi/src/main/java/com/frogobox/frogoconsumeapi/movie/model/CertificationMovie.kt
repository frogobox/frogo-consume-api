package com.frogobox.frogoconsumeapi.movie.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * TMDBAPI
 * Copyright (C) 13/03/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.frogoconsumeapi.movie.data.model
 *
 */
data class CertificationMovie(

    @SerializedName("US")
    var US: List<com.frogobox.frogoconsumeapi.movie.model.Certification>? = null,

    @SerializedName("CA")
    var CA: List<com.frogobox.frogoconsumeapi.movie.model.Certification>? = null,

    @SerializedName("AU")
    var AU: List<com.frogobox.frogoconsumeapi.movie.model.Certification>? = null,

    @SerializedName("DE")
    var DE: List<com.frogobox.frogoconsumeapi.movie.model.Certification>? = null,

    @SerializedName("FR")
    var FR: List<com.frogobox.frogoconsumeapi.movie.model.Certification>? = null,

    @SerializedName("NZ")
    var NZ: List<com.frogobox.frogoconsumeapi.movie.model.Certification>? = null,

    @SerializedName("IN")
    var IN: List<com.frogobox.frogoconsumeapi.movie.model.Certification>? = null,

    @SerializedName("GB")
    var GB: List<com.frogobox.frogoconsumeapi.movie.model.Certification>? = null,

    @SerializedName("NL")
    var NL: List<com.frogobox.frogoconsumeapi.movie.model.Certification>? = null,

    @SerializedName("BR")
    var BR: List<com.frogobox.frogoconsumeapi.movie.model.Certification>? = null,

    @SerializedName("FI")
    var FI: List<com.frogobox.frogoconsumeapi.movie.model.Certification>? = null,

    @SerializedName("BG")
    var BG: List<com.frogobox.frogoconsumeapi.movie.model.Certification>? = null,

    @SerializedName("ES")
    var ES: List<com.frogobox.frogoconsumeapi.movie.model.Certification>? = null,

    @SerializedName("PT")
    var PT: List<com.frogobox.frogoconsumeapi.movie.model.Certification>? = null,

    @SerializedName("MY")
    var MY: List<com.frogobox.frogoconsumeapi.movie.model.Certification>? = null,

    @SerializedName("CA-QC")
    var CAQC: List<com.frogobox.frogoconsumeapi.movie.model.Certification>? = null,

    @SerializedName("DK")
    var DK: List<com.frogobox.frogoconsumeapi.movie.model.Certification>? = null,

    @SerializedName("NO")
    var NO: List<com.frogobox.frogoconsumeapi.movie.model.Certification>? = null,

    @SerializedName("HU")
    var HU: List<com.frogobox.frogoconsumeapi.movie.model.Certification>? = null,

    @SerializedName("LT")
    var LT: List<com.frogobox.frogoconsumeapi.movie.model.Certification>? = null,

    @SerializedName("RU")
    var RU: List<com.frogobox.frogoconsumeapi.movie.model.Certification>? = null,

    @SerializedName("PH")
    var PH: List<com.frogobox.frogoconsumeapi.movie.model.Certification>? = null,

    @SerializedName("IT")
    var IT: List<com.frogobox.frogoconsumeapi.movie.model.Certification>? = null

)