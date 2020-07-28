package com.example.bff.components

import br.com.zup.beagle.annotation.RegisterWidget
import br.com.zup.beagle.widget.Widget

@RegisterWidget
data class ChatHeaderTime(
  val time: String,
  val styleId: String
) : Widget()