package com.stumpner.myss.web.crud;

import com.stumpner.myss.core.RecordEntry;
import com.stumpner.myss.core.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class ListController {

    @Autowired
    private RecordRepository repository;

    @GetMapping("/list")
    public String list(Model model) {

        List<RecordEntry> list = repository.findAll();

        model.addAttribute("recordList",list);

        return "list";
    }

}
