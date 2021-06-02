package com.wutsi.story.event

enum class StoryEventType(val urn: String) {
  PUBLISHED("urn:event:wutsi:story:published"),
  FEED_UPDATED("urn:event:wutsi:story:feed-updated")
}
