package com.wutsi.story

import com.wutsi.story.dto.GetStoryResponse
import feign.Param
import feign.RequestLine
import kotlin.Long

public interface StoryApi {
  @RequestLine("GET /v1/story/{id}")
  public fun `get`(@Param("id") id: Long): GetStoryResponse
}
