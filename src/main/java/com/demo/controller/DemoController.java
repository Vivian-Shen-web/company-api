package com.demo.controller;

import com.demo.domain.web.R;
import com.demo.service.DemoService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {
    private final DemoService demoService;

    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    /**
     * 测试接口
     */
    @Operation(summary = "测试接口")
    @GetMapping
    public R<String> demo() {
        String str = this.demoService.demo();
        return R.success(str);
    }
}
