package com.wutsi.story.dto

import kotlin.Int
import kotlin.Long
import kotlin.String

public data class StorySummary(
  public val id: Long = 0,
  public val siteId: Long = 1,
  public val userId: Long = 0,
  public val title: String = "",
  public val tagLine: String = "",
  public val summary: String = "",
  public val slug: String = "",
  public val wppStatus: String? = null,
  public val readingMinutes: Int = 0,
  public val publishedDateTime: Long = 0,
  public val access: String = ""
)
