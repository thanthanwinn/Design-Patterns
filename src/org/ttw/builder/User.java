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

        private static Builder builder(){
            return new Builder();
        }

        public static Builder builder(String username, String password){
            return builder().username(username).password(password);
        }
        public Builder username(String username){
            this.username = username;
            return  this;

        }
        public Builder address(String address){
            this.address = address;
            return  this;
        }
        public Builder password(String  password){
            this.password = password;
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
