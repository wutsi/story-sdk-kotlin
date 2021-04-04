package com.wutsi.story

enum class Environment(public val url: String) {
  PRODUCTION("https://int-com-wutsi-blog.herokuapp.com"),
  SANDBOX("https://com-wutsi-blog.herokuapp.com")
}
