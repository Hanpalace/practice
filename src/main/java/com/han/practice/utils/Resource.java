package com.han.practice.utils;

import java.io.IOException;

public class Resource {
    public static void main(String[] args) throws IOException {
        System.out.println("------------------------------getResource(\"\")测试---------------------");
        // 1 返回 target/classes/package
        System.out.println(Resource.class.getResource(""));
        // 2 同级（编译路径）下，是否存在对应文件，存在则返回该地址
        System.out.println(Resource.class.getResource("Resource.class"));
        // 3 不存在，返回 null
        System.out.println(Resource.class.getResource("NoResource.class") + "\n\n");

        System.out.println("------------------------------getResource(\"/\")测试---------------------");
        // 4 返回 target/classes/
        System.out.println(Resource.class.getResource("/"));
        // 5 target/classes/ 目录下不存在 Resource.class
        System.out.println(Resource.class.getResource("/Resource.class"));
        // 6 target/classes/ 目录下存在 cn/zhang
        System.out.println(Resource.class.getResource("/cn/zhang"));
    }
}
