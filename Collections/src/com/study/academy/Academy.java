package com.study.academy;

import java.util.ArrayList;

public class Academy {
    
    private String academyCode;
    private String name;
    //private ClassRoom rooms[];
    private ArrayList<ClassRoom> rooms = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();
    
    public Academy(){
        // TODO 교실 3개 생성
        
    }
    
    public void addClassRoom(ClassRoom room){
        // ClassRoom room = new ClassRoom();
        rooms.add(room);
        
    }
    
    public void addStudent(Student std){
        for(ClassRoom room : rooms){
            if(room.getRoomCode().equals(std.getRoomNo())){
                room.addStudent(std);
            }
        }
    }
    
    public void showRoomList(){
        
        for (ClassRoom room : rooms) {
            System.out.println(room.getName());
            
            room.showStudentList();
        }
    }
    
    public void setStudent(ClassRoom room, Student student){
        // 구현 시작
        
    }

    public String getAcademyCode() {
        return academyCode;
    }

    public void setAcademyCode(String academyCode) {
        this.academyCode = academyCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
