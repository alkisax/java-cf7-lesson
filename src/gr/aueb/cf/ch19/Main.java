package gr.aueb.cf.ch19;

public class Main {
    public static void main(String[] args) {
        NodeObj nodeObj = new NodeObj();
        nodeObj.setItem("COding");

        int item = (int) nodeObj.getItem();
        System.out.println(item); //string can not be cast to int
    }
}
