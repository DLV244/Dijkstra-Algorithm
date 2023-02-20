package Dijkstra;

import java.util.Scanner;

public class Dijkstra  {
        public static void main(String[] args) {
           
//khai báo các điểm
        Vert vA = new Vert("A");
        Vert vB = new Vert("B");
        Vert vC = new Vert("C");
        Vert vD = new Vert("D");
        Vert vE = new Vert("E");
        Vert vF = new Vert("F");
        Vert vG = new Vert("G");
//Khai báo các đường nối và độ dài giữa các điểm      
        vA.addNeighbour(new Edge(335, vA, vB));
        vA.addNeighbour(new Edge(615, vA, vG));   
        vB.addNeighbour(new Edge(525, vB, vC));
        vB.addNeighbour(new Edge(675, vB, vF));
        vC.addNeighbour(new Edge(700, vC, vD));
        vC.addNeighbour(new Edge(790, vC, vE));
        vD.addNeighbour(new Edge(700, vD, vC));
        vD.addNeighbour(new Edge(275, vD, vE));
        vE.addNeighbour(new Edge(790, vE, vC));
        vE.addNeighbour(new Edge(275, vE, vD));
        vE.addNeighbour(new Edge(350, vE, vF));
        vF.addNeighbour(new Edge(675, vF, vB));
        vF.addNeighbour(new Edge(350, vF, vE));
        vF.addNeighbour(new Edge(400, vF, vG));
        vG.addNeighbour(new Edge(615, vG, vA));
        vG.addNeighbour(new Edge(400, vG, vF));
//Tìm đường đi ngắn nhất từ 1 điểm đến các điểm còn lại        
        PathFinder shortestPath = new PathFinder();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập điểm bắt đầu: "); 
        String DiemBatDau = scanner.next();
    if ( DiemBatDau.matches("A|B|C|D|E|F|G")){//Điều kiện tổng
    // Đường đi từ A    
        if ( DiemBatDau.equals("A") ){
        shortestPath.ShortestP(vA);
        System.out.println("Khoảng cách tối thiểu từ:");
        System.out.println("A đến B: " + vB.getDist());
        System.out.println("A đến C: " + vC.getDist());
        System.out.println("A đến D: " + vD.getDist());
        System.out.println("A đến E: " + vE.getDist());
        System.out.println("A đến F: " + vF.getDist());
        System.out.println("A đến G: " + vG.getDist());
        System.out.println("\nĐường đi ngắn nhất từ:");
        System.out.println("A đến B: " + shortestPath.getShortestP(vB));
        System.out.println("A đến C: " + shortestPath.getShortestP(vC));
        System.out.println("A đến D: " + shortestPath.getShortestP(vD));
        System.out.println("A đến E: " + shortestPath.getShortestP(vE));
        System.out.println("A đến F: " + shortestPath.getShortestP(vF));
        System.out.println("A đến G: " + shortestPath.getShortestP(vG)); 
        }
    //Đường đi từ B   
        if ( DiemBatDau.equals("B") ) {
        shortestPath.ShortestP(vB);
        System.out.println("Khoảng cách tối thiểu từ:");
        System.out.println("B đến A: " + vA.getDist());
        System.out.println("B đến C: " + vC.getDist());
        System.out.println("B đến D: " + vD.getDist());
        System.out.println("B đến E: " + vE.getDist());
        System.out.println("B đến F: " + vF.getDist());
        System.out.println("B đến G: " + vG.getDist());
        System.out.println("\nĐường đi ngắn nhất từ:");
        System.out.println("B đến A: " + shortestPath.getShortestP(vA));
        System.out.println("B đến C: " + shortestPath.getShortestP(vC));
        System.out.println("B đến D: " + shortestPath.getShortestP(vD));
        System.out.println("B đến E: " + shortestPath.getShortestP(vE));
        System.out.println("B đến F: " + shortestPath.getShortestP(vF));
        System.out.println("B đến G: " + shortestPath.getShortestP(vG)); 
        }
    //Đường đi từ C    
        if ( DiemBatDau.equals("C") ) {
        shortestPath.ShortestP(vC);
        System.out.println("Khoảng cách tối thiểu từ:");
        System.out.println("C đến A: " + vA.getDist());
        System.out.println("C đến B: " + vB.getDist());
        System.out.println("C đến D: " + vD.getDist());
        System.out.println("C đến E: " + vE.getDist());
        System.out.println("C đến F: " + vF.getDist());
        System.out.println("C đến G: " + vG.getDist());
        System.out.println("\nĐường đi ngắn nhất từ:");
        System.out.println("C đến A: " + shortestPath.getShortestP(vA));
        System.out.println("C đến B: " + shortestPath.getShortestP(vB));
        System.out.println("C đến D: " + shortestPath.getShortestP(vD));
        System.out.println("C đến E: " + shortestPath.getShortestP(vE));
        System.out.println("C đến F: " + shortestPath.getShortestP(vF));
        System.out.println("C đến G: " + shortestPath.getShortestP(vG)); 
        }
    //Đường đi từ D    
        if ( DiemBatDau.equals("D") ) {
        shortestPath.ShortestP(vD);
        System.out.println("Khoảng cách tối thiểu từ:");
        System.out.println("D đến A: " + vA.getDist());
        System.out.println("D đến B: " + vB.getDist());
        System.out.println("D đến C: " + vC.getDist());
        System.out.println("D đến E: " + vE.getDist());
        System.out.println("D đến F: " + vF.getDist());
        System.out.println("D đến G: " + vG.getDist());
        System.out.println("\nĐường đi ngắn nhất từ:");
        System.out.println("D đến A: " + shortestPath.getShortestP(vA));
        System.out.println("D đến B: " + shortestPath.getShortestP(vB));
        System.out.println("D đến C: " + shortestPath.getShortestP(vC));
        System.out.println("D đến E: " + shortestPath.getShortestP(vE));
        System.out.println("D đến F: " + shortestPath.getShortestP(vF));
        System.out.println("D đến G: " + shortestPath.getShortestP(vG)); 
        }
    //Đường đi từ E    
        if ( DiemBatDau.equals("E") ) {
        shortestPath.ShortestP(vE);
        System.out.println("Khoảng cách tối thiểu từ:");
        System.out.println("E đến A: " + vA.getDist());
        System.out.println("E đến B: " + vB.getDist());
        System.out.println("E đến C: " + vC.getDist());
        System.out.println("E đến D: " + vD.getDist());
        System.out.println("E đến F: " + vF.getDist());
        System.out.println("E đến G: " + vG.getDist());
        System.out.println("\nĐường đi ngắn nhất từ:");
        System.out.println("E đến A: " + shortestPath.getShortestP(vA));
        System.out.println("E đến B: " + shortestPath.getShortestP(vB));
        System.out.println("E đến C: " + shortestPath.getShortestP(vC));
        System.out.println("E đến D: " + shortestPath.getShortestP(vD));
        System.out.println("E đến F: " + shortestPath.getShortestP(vF));
        System.out.println("E đến G: " + shortestPath.getShortestP(vG)); 
        }    
    //Đường đi từ F   
        if ( DiemBatDau.equals("F") ) {
        shortestPath.ShortestP(vF);
        System.out.println("Khoảng cách tối thiểu từ:");
        System.out.println("F đến A: " + vA.getDist());
        System.out.println("F đến B: " + vB.getDist());
        System.out.println("F đến C: " + vC.getDist());
        System.out.println("F đến D: " + vD.getDist());
        System.out.println("F đến E: " + vE.getDist());
        System.out.println("F đến G: " + vG.getDist());
        System.out.println("\nĐường đi ngắn nhất từ:");
        System.out.println("F đến A: " + shortestPath.getShortestP(vA));
        System.out.println("F đến B: " + shortestPath.getShortestP(vB));
        System.out.println("F đến C: " + shortestPath.getShortestP(vC));
        System.out.println("F đến D: " + shortestPath.getShortestP(vD));
        System.out.println("F đến E: " + shortestPath.getShortestP(vE));
        System.out.println("F đến G: " + shortestPath.getShortestP(vG)); 
        }
    //Đường đi từ G    
        if ( DiemBatDau.equals("G") ) {
        shortestPath.ShortestP(vG);
        System.out.println("Khoảng cách tối thiểu từ:");
        System.out.println("G đến A: " + vA.getDist());
        System.out.println("G đến B: " + vB.getDist());
        System.out.println("G đến C: " + vC.getDist());
        System.out.println("G đến D: " + vD.getDist());
        System.out.println("G đến E: " + vE.getDist());
        System.out.println("G đến F: " + vF.getDist());
        System.out.println("\nĐường đi ngắn nhất từ:");
        System.out.println("G đến A: " + shortestPath.getShortestP(vA));
        System.out.println("G đến B: " + shortestPath.getShortestP(vB));
        System.out.println("G đến C: " + shortestPath.getShortestP(vC));
        System.out.println("G đến D: " + shortestPath.getShortestP(vD));
        System.out.println("G đến E: " + shortestPath.getShortestP(vE));
        System.out.println("G đến F: " + shortestPath.getShortestP(vF)); 
        }
        }
    else {
        System.out.println("Điểm đã nhập không có trên sơ đồ");//Báo lỗi
    }   
        }
}
         
        

        
        
    

