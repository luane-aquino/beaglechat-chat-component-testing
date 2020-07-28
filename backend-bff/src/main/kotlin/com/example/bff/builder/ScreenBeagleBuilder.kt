package com.example.bff.builder

import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyFlex
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.ext.unitReal
import br.com.zup.beagle.widget.core.AlignSelf
import br.com.zup.beagle.widget.core.EdgeValue
import br.com.zup.beagle.widget.core.Flex
import br.com.zup.beagle.widget.core.FlexDirection
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.layout.Screen
import br.com.zup.beagle.widget.layout.ScreenBuilder
import br.com.zup.beagle.widget.ui.Text
import com.example.bff.components.ChatHeaderImage
import com.example.bff.components.ChatHeaderName
import com.example.bff.components.ChatHeaderTime

object ScreenBeagleBuilder : ScreenBuilder {
  override fun build() = Screen(
    child = Container(
      children = listOf(
        ChatHeaderImage(
          url = "https://www.pngitem.com/pimgs/m/22-223925_female-avatar-female-avatar-no-face-hd-png.png",
          alt = "luane aquino",
          styleId = "chatHeaderImage"
        ),
        ChatHeaderName(
          name = "luane aquino",
          styleId = "chatHeaderName"
        ),
        ChatHeaderTime(
          time = "12:50",
          styleId = "chatHeaderTime"
        ).applyFlex(
          Flex(
            alignSelf = AlignSelf.FLEX_END
          )
        )
      )
    ).applyStyle(
      Style(
        backgroundColor = "#29bdde",
        flex = Flex(flexDirection = FlexDirection.ROW)
      )
    )
  )
}