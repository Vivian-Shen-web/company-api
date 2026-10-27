package com.demo.service.impl;

import com.demo.repository.DemoRepository;
import com.demo.service.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {
    private final DemoRepository demoRepository;

    public DemoServiceImpl(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }

    @Override
    public String demo() {
        return "Hello Word";
    }
}
