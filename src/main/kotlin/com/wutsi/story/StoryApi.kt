package com.wutsi.story

import com.wutsi.story.dto.GetStoryResponse
import com.wutsi.story.dto.SearchStoryResponse
import feign.Param
import feign.RequestLine
import kotlin.Int
import kotlin.Long

public interface StoryApi {
  @RequestLine("GET /v1/story/{id}")
  public fun `get`(@Param("id") id: Long): GetStoryResponse

  @RequestLine("GET /v1/stories/published")
  public fun published(@Param("limit") limit: Int, @Param("offset") offset: Int):
      SearchStoryResponse
}
