package org.ttw.builder;

public class BuilderDemo {
    public static void main(String[] args){

        User user = User.Builder.builder().username("aung aung").addresss("yangon").age(23).password("123").build();
        System.out.println(user.getAddress());
        System.out.println(user.getUsername());
        System.out.println(user.getAge());
        System.out.println(user.getPassword());
    }
}
