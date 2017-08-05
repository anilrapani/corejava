/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums_2;
class FreshJuice{
    enum FreshJuiceSize{SMALL, MEDIUM, LARGE};
    FreshJuiceSize size;
    
}

class FreshJuiceTest{
    public static void main(String[] args) {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.LARGE;
        System.out.println("juice selected : " +juice.size);
    }
}