package kr.ac.kumoh.ce.s20180147.GF2DollListBackend.controller

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin(origins = ["https://gf2dolllist.netlify.app/"])
class GF2DollListController {
  @GetMapping
  fun getRoot() = mapOf("status" to "success")

  @GetMapping("/api/message")
  fun getMessage() = mapOf("status" to "success")
}