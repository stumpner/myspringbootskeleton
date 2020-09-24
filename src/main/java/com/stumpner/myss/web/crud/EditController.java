package com.stumpner.myss.web.crud;

import com.stumpner.myss.core.RecordEntry;
import com.stumpner.myss.core.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class EditController {

    @Autowired
    private RecordRepository repository;

    @GetMapping("/edit")
    public String edit(@RequestParam(name="id", required = false, defaultValue = "") String id, Model model) {

        List<RecordEntry> list = repository.findAll();

        if (id.isEmpty()) {
            model.addAttribute("record", new RecordEntry());
        } else {
            Optional<RecordEntry> o = repository.findById(id);
            if (o.isEmpty()) { return "empty"; }
            else {
                model.addAttribute("record", o.get());
            }
        }

        return "edit";
    }

    @PostMapping("/edit")
    public String submit(@ModelAttribute RecordEntry record, Model model) {

        if (record.getId().isEmpty()) {
            System.out.println("record added");
        } else {
            System.out.println("record changed");
        }

        model.addAttribute("record", record);

        repository.save(record);

        return "editresult";
    }

}
