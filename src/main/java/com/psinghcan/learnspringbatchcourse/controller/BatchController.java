package com.psinghcan.learnspringbatchcourse.controller;

import com.psinghcan.learnspringbatchcourse.service.BatchService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BatchController {
    public BatchController(BatchService batchService) {
        this.batchService = batchService;
    }

    @GetMapping("batch")
    public String batchJob(){
        batchService.startBatchJob("simple");
        return "batch job has been started";
    }

    private BatchService batchService;
}
