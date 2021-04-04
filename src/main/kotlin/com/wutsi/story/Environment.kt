package com.wutsi.story

enum class Environment(public val url: String) {
  PRODUCTION("https://int-wutsi-blog-service.herokuapp.com"),
  SANDBOX("https://wutsi-blog-service.herokuapp.com")
}
