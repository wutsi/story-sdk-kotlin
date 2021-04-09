package com.wutsi.story

import com.fasterxml.jackson.databind.ObjectMapper

public class StoryApiBuilder {
  public fun build(env: Environment, mapper: ObjectMapper) = feign.Feign.builder()
    .client(feign.okhttp.OkHttpClient())
    .encoder(feign.jackson.JacksonEncoder(mapper))
    .decoder(feign.jackson.JacksonDecoder(mapper))
    .logger(feign.slf4j.Slf4jLogger())
    .target(StoryApi::class.java, env.url)
}
