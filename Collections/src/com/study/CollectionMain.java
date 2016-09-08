package com.study;

import com.study.academy.Academy;
import com.study.academy.ClassRoom;
import com.study.academy.Student;

public class CollectionMain {
    public static void main(String[] args) {
        // 객체를 추상화 : 객체를 카테고리로 
        // 학원 - 안드로이드반, 프론트엔드반, 영어반 - 김도형, 임재민, 백향목
        
        Academy academy = new Academy();
        academy.setName("Fast Campus");
        academy.setAcademyCode("ACA001");
        
        ClassRoom room1 = new ClassRoom();
        ClassRoom room2 = new ClassRoom();
        
        room1.setName("안드로이드");
        room1.setRoomCode("CLS001");
        room1.setSize(50);
        //rooms.add(room1);
        
        room2.setName("FrontEnd");
        room2.setRoomCode("CLS002");
        room2.setSize(20);
        //rooms.add(room2);
        
        academy.addClassRoom(room1);
        academy.addClassRoom(room2);
        
        
        Student std1    = new Student();
        std1.setName("백향목");
        std1.setRoomNo("CLS001");
        Student std2    = new Student();
        std2.setName("최재형");
        std2.setRoomNo("CLS001");
        Student std3    = new Student();
        std3.setName("안준혁");
        std3.setRoomNo("CLS001");
        Student std4    = new Student();
        std4.setName("이순신");
        std4.setRoomNo("CLS002");
        Student std5    = new Student();
        std5.setName("세종대왕");
        std5.setRoomNo("CLS002");
        Student std6    = new Student();
        std6.setName("신사임당");
        std6.setRoomNo("CLS002");
        
        academy.addStudent(std1);
        academy.addStudent(std2);
        academy.addStudent(std3);
        academy.addStudent(std4);
        academy.addStudent(std5);
        academy.addStudent(std6);
        
        academy.showRoomList();
                
    }

}
