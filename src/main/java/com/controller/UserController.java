package com.controller;

import com.bean.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 获取用户列表
     */
    @RequestMapping("/")
    public String getList(Model model){
        List<User>list=userService.fingAll();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("/toAdd")
    public String toadd(){
        return "add";
    }

    @RequestMapping("/add")
    public String save(User user){
        userService.add(user);

        return "redirect:/";

    }

    @RequestMapping("/toEdit/{id}")
    public String toedit(@PathVariable("id") Long id, Model model){
        User user=userService.fingOne(id);
        model.addAttribute("user",user);
        return "bj";
    }

    @RequestMapping("/update")
    public String update(User user){
        userService.update(user);
        return "redirect:/";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id){
        userService.delete(id);

        return "redirect:/";
    }
}
