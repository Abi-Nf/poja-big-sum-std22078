package app.poja.exam.endpoint.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.math.BigInteger;

@RestController
public class BigSumController {
  @GetMapping("/big-sum")
  public BigInteger getBigSum(
      @RequestParam(defaultValue="0", required=false) BigInteger a,
      @RequestParam(defaultValue="0", required=false) BigInteger b,
      HttpServletResponse response
  ){
    response.addHeader("content-type", "text/plain");
    return a.add(b);
  }
}
