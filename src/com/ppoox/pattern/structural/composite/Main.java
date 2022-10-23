package com.ppoox.pattern.structural.composite;

public class Main {
    public static void main(String[] args) {
        /**
         * 여러 개의 객체들로 구성된 복합 객체와 단일 객체를 클라이언트에서 구별 없이 다루게 해주는 패턴
         */

        Folder schoolFolder = new Folder("학교");

        Folder grade1Folder = new Folder("1학년");
        Folder grade2Folder = new Folder("2학년");
        schoolFolder.add(grade1Folder);
        schoolFolder.add(grade2Folder);

        File enterPhoto = new File("입학사진", 256);
        grade1Folder.add(enterPhoto);

        Folder sem1Folder = new Folder("1학기");
        Folder sem2Folder = new Folder("2학기");
        grade2Folder.add(sem1Folder);
        grade2Folder.add(sem2Folder);

        File lecturePlan = new File("강의계획서", 120);
        sem1Folder.add(lecturePlan);

        Folder projectFolder = new Folder("프로젝트");
        sem2Folder.add(projectFolder);

        File draft = new File("드래프트", 480);
        File finalResult = new File("결과물", 500);

        projectFolder.add(draft);
        projectFolder.add(finalResult);

        schoolFolder.getSize();

        System.out.println("============================");

        schoolFolder.remove();
    }
}
