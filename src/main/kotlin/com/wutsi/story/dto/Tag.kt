package com.wutsi.story.dto

import kotlin.Long
import kotlin.String

public data class Tag(
  public val id: Long = 0,
  public val name: String = "",
  public val displayName: String = "",
  public val totalStories: Long = 0
)
