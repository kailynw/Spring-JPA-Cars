//package com.williams.kailyn.learningjpa;
//
//import com.williams.kailyn.learningjpa.entity.User;
//import com.williams.kailyn.learningjpa.dao.UserDaoService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class UserDaoServiceCommandLineRunner implements CommandLineRunner {
//
//    @Autowired
//    UserDaoService userDaoService;
//
//    private static final Logger log= LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
//
//    @Override
//    public void run(String... args) throws Exception {
//        for(int i=0; i<10; i++) {
//            User userInsert = userDaoService.insert(new User("James", "Manager"));
//            log.info(userInsert.toString());
//        }
//
//    }
//}
