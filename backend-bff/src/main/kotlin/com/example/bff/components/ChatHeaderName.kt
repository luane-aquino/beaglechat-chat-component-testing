package com.example.bff.components

import br.com.zup.beagle.annotation.RegisterWidget
import br.com.zup.beagle.widget.Widget

@RegisterWidget
data class ChatHeaderName(
  val name: String,
  val styleId: String
) : Widget()