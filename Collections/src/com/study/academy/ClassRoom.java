package com.study.academy;

import java.util.ArrayList;

public class ClassRoom {
    // TODO 학생 생성
    
    private String name;
    private int size;
    private String roomCode;
    private ArrayList<Student> students = new ArrayList<>();
    
    public ClassRoom(){
        

    }
    
    public void addStudent(Student std){
        students.add(std);
    }
    
    public void showStudentList(){
        for(Student s : students){
            System.out.println("- "+s.getName());
        }
        
//        for(Student std : students){
//            System.out.println("- "+std.getName());
//        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }    
    
}
