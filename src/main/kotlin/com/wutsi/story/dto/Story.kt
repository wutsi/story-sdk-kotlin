package com.wutsi.story.dto

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonFormat.Shape.NUMBER
import java.time.OffsetDateTime
import kotlin.Int
import kotlin.Long
import kotlin.String

public data class Story(
  public val id: Long = 0,
  public val siteId: Long = 1,
  public val userId: Long = 0,
  public val title: String = "",
  public val tagLine: String = "",
  public val summary: String = "",
  public val slug: String = "",
  public val socialMediaMessage: String? = null,
  public val wppStatus: String? = null,
  public val content: String = "",
  public val readingMinutes: Int = 0,

  @JsonFormat(shape = NUMBER)
  public val publishedDateTime: OffsetDateTime = OffsetDateTime.now()
)
