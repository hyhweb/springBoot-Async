package com.springboot.async.controller;

import com.springboot.async.service.AsyncTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {
    @Autowired
    private AsyncTaskService asyncTaskService;
    @GetMapping("/asyncTask")
    public void asyncTask(){
    for (int i = 0; i < 100; i++) {
      asyncTaskService.executeAsyncTask(i);
    }
    }
}
