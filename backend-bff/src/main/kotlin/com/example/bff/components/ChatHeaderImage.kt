package com.example.bff.components

import br.com.zup.beagle.annotation.RegisterWidget
import br.com.zup.beagle.widget.Widget

@RegisterWidget
data class ChatHeaderImage(
  val url: String,
  val alt: String,
  val styleId: String
) : Widget()