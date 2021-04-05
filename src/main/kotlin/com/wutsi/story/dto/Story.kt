package com.wutsi.story.dto

import kotlin.Long
import kotlin.String

public data class Story(
  public val id: Long = 0,
  public val siteId: Long = 0,
  public val userId: Long = 0,
  public val title: String = "",
  public val tagLine: String = "",
  public val summary: String = "",
  public val slug: String = "",
  public val socialMediaMessage: String? = null
)
