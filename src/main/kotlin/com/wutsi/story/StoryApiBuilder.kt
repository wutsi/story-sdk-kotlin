package com.wutsi.story

import com.fasterxml.jackson.databind.ObjectMapper
import feign.RequestInterceptor
import kotlin.collections.List

public class StoryApiBuilder {
  public fun build(
    env: Environment,
    mapper: ObjectMapper,
    interceptors: List<RequestInterceptor> = emptyList()
  ) = feign.Feign.builder()
    .client(feign.okhttp.OkHttpClient())
    .encoder(feign.jackson.JacksonEncoder(mapper))
    .decoder(feign.jackson.JacksonDecoder(mapper))
    .logger(feign.slf4j.Slf4jLogger())
    .requestInterceptors(interceptors)
    .target(StoryApi::class.java, env.url)
}
