package com.wutsi.story.dto

import kotlin.collections.List

public data class SearchTopicResponse(
  public val story: List<Topic> = emptyList()
)
