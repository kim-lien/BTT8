package com.mycompany.baitap1;

import java.util.Scanner;
 public class hinhvuong extends hinhchunhat {
     public hinhvuong() {
         ten = "hình vuông";
     }
     public void nhapCanh() {
         Scanner sc = new Scanner(System.in);
         System.out.print("Nhập cạnh: ");
         dai = rong = sc.nextFloat();
     }
     @Override
     public void nhapThongTin() {
         nhapCanh();
     }
 }
