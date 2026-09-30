package org.ttw.builder;

public class User {
    private String username;
    private String address;
    private String password;
    private int age;

    public String getUsername() {
        return username;
    }

    public String getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }
    public static Builder builder(String username, String password) {
        return new Builder(username, password);
    }


    public User(String username, String address, String password, int age) {
        this.username = username;
        this.address = address;
        this.password = password;
        this.age = age;
    }

    static class Builder{
        private String username;
        private String address;
        private String password;
        private int age;

        public Builder(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public Builder address(String address){
            this.address = address;
            return  this;
        }

        public Builder age(int age){
            this.age = age;
            return  this;
        }
        public User build(){
            return  new User(this.username,this.address,this.password,this.age);
        }
    }
}
