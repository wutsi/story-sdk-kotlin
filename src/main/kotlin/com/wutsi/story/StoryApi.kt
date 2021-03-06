package com.wutsi.story

import com.wutsi.story.dto.GetStoryResponse
import com.wutsi.story.dto.SearchStoryResponse
import com.wutsi.story.dto.SearchTopicResponse
import com.wutsi.story.dto.TranslateStoryResponse
import feign.Headers
import feign.Param
import feign.RequestLine
import java.time.LocalDate
import kotlin.Int
import kotlin.Long
import kotlin.String

public interface StoryApi {
  @RequestLine("GET /v1/story/{id}")
  @Headers("Content-Type: application/json")
  public fun `get`(@Param("id") id: Long): GetStoryResponse

  @RequestLine("GET /v1/story/{id}/translate?language={language}")
  @Headers("Content-Type: application/json")
  public fun translate(@Param("id") id: Long, @Param("language") language: String):
      TranslateStoryResponse

  @RequestLine("GET /v1/stories/published?site-id={site-id}&start-date={start-date}&end-date={end-date}&limit={limit}&offset={offset}")
  @Headers("Content-Type: application/json")
  public fun published(
    @Param("site-id") siteId: Long = 1,
    @Param("start-date") startDate: LocalDate? = null,
    @Param("end-date") endDate: LocalDate? = null,
    @Param("limit") limit: Int,
    @Param("offset") offset: Int
  ): SearchStoryResponse

  @RequestLine("GET /v1/topics")
  @Headers("Content-Type: application/json")
  public fun topics(): SearchTopicResponse
}
