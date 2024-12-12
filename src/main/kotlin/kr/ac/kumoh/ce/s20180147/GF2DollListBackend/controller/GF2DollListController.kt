package kr.ac.kumoh.ce.s20180147.GF2DollListBackend.controller

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/message") // 백엔드 작동 확인용
class GF2DollListController {
  @GetMapping
  // TODO: React 주소 변경할 것
  @CrossOrigin(origins = ["http://localhost:3000"])
  fun getMessage() = mapOf("status" to "success")
}