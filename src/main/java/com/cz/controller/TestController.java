package com.cz.controller;

import com.cz.entity.Job;
import com.cz.entity.User;
import com.cz.mapper.JobMapper;
import com.cz.mgservies.UserServies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    private JobMapper jobMapper;
    @Autowired
    private UserServies userServies;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public List<Job> getLove() {
        List<Job> jobs = jobMapper.getJobs();

        return jobs;
    }

    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    public Integer addLove() {
        ArrayList<Job> list = new ArrayList<>();
        list.add(new Job("asdf", "qwer"));
        list.add(new Job("asdf11", "qwer11"));
        list.add(new Job("asdf22", "qwer22"));
        int addJobs = jobMapper.addJobs(list);
        return addJobs;
    }

    @RequestMapping(value = "/testmg", method = RequestMethod.GET)
    public List<User> getUsers() {
        List<User> users = userServies.getUsers();
        return users;
    }
}
