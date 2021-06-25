package org.codejudge.sb.controller;

import io.swagger.annotations.ApiOperation;
import org.codejudge.sb.info.AdditionInfo;
import org.codejudge.sb.info.SumInfo;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping
public class AppController {

    @GetMapping("/")
    @ApiOperation("This is the hello world api")
    public String hello() {
        return "Hello World!!";
    }

    @PostMapping(value = "/api/add")
    public SumInfo addition(@Valid @RequestBody AdditionInfo additionInfo) {
        Integer sum = additionInfo.getNumber1() + additionInfo.getNumber2();
        SumInfo sumInfo = new SumInfo();
        sumInfo.setSum(sum);
        return sumInfo;
    }

}
