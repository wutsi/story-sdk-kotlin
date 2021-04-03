package com.wutsi.site

import com.wutsi.site.dto.GetStoryResponse
import feign.Param
import feign.RequestLine
import kotlin.Long

public interface StoryApi {
  @RequestLine("GET /v1/story/{id}")
  public fun `get`(@Param("id") id: Long): GetStoryResponse
}
