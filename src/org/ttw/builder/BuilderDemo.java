package org.ttw.builder;

public class BuilderDemo {
    public static void main(String[] args){

        User user = User.Builder.builder("aung aung","123").age(23).address("yangon").build();
        System.out.println(user.getAddress());
        System.out.println(user.getUsername());
        System.out.println(user.getAge());
        System.out.println(user.getPassword());
    }
}
