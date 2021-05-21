package com.wutsi.story

import com.wutsi.story.dto.GetStoryResponse
import com.wutsi.story.dto.SearchStoryResponse
import feign.Headers
import feign.Param
import feign.RequestLine
import kotlin.Int
import kotlin.Long

public interface StoryApi {
  @RequestLine("GET /v1/story/{id}")
  @Headers("Content-Type: application/json")
  public fun `get`(@Param("id") id: Long): GetStoryResponse

  @RequestLine("GET /v1/stories/published?limit={limit}&offset={offset}")
  @Headers("Content-Type: application/json")
  public fun published(@Param("limit") limit: Int, @Param("offset") offset: Int):
      SearchStoryResponse
}
