package com.wutsi.story.dto

import kotlin.Long
import kotlin.String

public data class Topic(
  public val id: Long = 0,
  public val parentId: Long? = null,
  public val name: String = ""
)
