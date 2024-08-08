package com.cathaybk.practice.nt00508726.b;

public class Practice1 {
    /*【實作練習 1 九 九乘法表 】 套 件名稱： c om.cathaybk. practice . 行 編 ).b
    (1) 由左至右顯示九九乘法乘積之格式為「被乘數 乘數 乘積」，被乘數固定不變，乘數為 1~9 之變動數值
    (2) 由上至下顯示九九乘法之乘積，乘數固定不變，被乘數為 2 ~9 之變動數值
    (3) 顯示九九乘法表由上至下每一列須以「被乘數」對齊
    優化 直接一行Strinf format
    * */
    public static void main(String[] args) {
        int result = 0;
        String resultString = "";
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                result = i * j;
                resultString = String.format("%d*%d =%2d  ", i, j, result);
                System.out.print(resultString);
            }
            System.out.print("\n");

        }
    }
}
