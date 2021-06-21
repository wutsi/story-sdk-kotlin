package com.wutsi.story.dto

import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.collections.List

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
  public val publishedDateTime: Long = 0,
  public val access: String = "",
  public val tags: List<Tag> = emptyList(),
  public val type: Topic = Topic()
)
