package com.example.springproj1.controller;


import com.example.springproj1.dao.categoryRepo;
import com.example.springproj1.dao.expenseRepo;
import com.example.springproj1.dao.userRepo;
import com.example.springproj1.model.Category;
import com.example.springproj1.model.Expense;
import com.example.springproj1.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Objects;

@Controller
public class projController {

    @Autowired
    categoryRepo crp;
    @Autowired
    expenseRepo exp;
    @Autowired
    userRepo urp;



    @RequestMapping("")
    private String getHomePage(){
        return "home.jsp";
    }

    @RequestMapping("register")
    private String getRegisterPage(){
        return "register.jsp";
    }

    @RequestMapping("login")
    private String getLoginPage(){
        return "login.jsp";
    }

    @RequestMapping("addUser")
    private ModelAndView addUser(Users user){
        try{
            urp.save(user);
            System.out.println("user saved");

        }catch(Exception e){
            System.out.println(e);
        }
        return new ModelAndView("home.jsp");
    }

    @RequestMapping("loginUser")
    private ModelAndView loginUser(@RequestParam("email") String email, @RequestParam("password") String pass){
        ModelAndView mv=new ModelAndView("home.jsp");
        Users dbUser= urp.findUserByEmail(email);
        try{
            if(Objects.equals(dbUser.getEmail(), email) && Objects.equals(dbUser.getPassword(), pass)){
                ModelAndView mv1=new ModelAndView("loginMenu.jsp");
                List<Expense> expenses=exp.findAll();
                mv1.addObject("expenses",expenses);
                return mv1;
            }
        }catch(Exception e){
            System.out.println(e);
        }

        return mv;
    }

    @RequestMapping("createexpense")
    private String createExpense(){
        return "createExpense.jsp";
    }

    @RequestMapping("addExpense")
    private ModelAndView addExpense(Expense expense){
        ModelAndView mv=new ModelAndView("getAllExpense.jsp");
        System.out.println(expense);
        try{
            exp.save(expense);
            System.out.println(expense);
            List<Expense> ex=exp.findAll();
            mv.addObject("ex",ex);
            return mv;

        }catch(Exception e){
            System.out.println(e);

        }
        return mv;

    }

    @RequestMapping("createcategory")
    private String createCategory(){
        return "createCategory.jsp";
    }


    @RequestMapping("addCategory")
    private ModelAndView addCategory(Category cat){
        ModelAndView mv=new ModelAndView("createCategory.jsp");
        System.out.println(cat);
        try{
            crp.save(cat);
            mv=new ModelAndView("getAllCategory.jsp");
            List<Category> cat1=crp.findAll();
            mv.addObject("cat",cat1);
            return mv;
        }catch(Exception e){
            System.out.println(e);
        }

        return mv;
    }

}
