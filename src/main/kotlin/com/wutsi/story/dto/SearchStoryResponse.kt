package com.wutsi.story.dto

import kotlin.collections.List

public data class SearchStoryResponse(
  public val stories: List<StorySummary> = emptyList()
)
