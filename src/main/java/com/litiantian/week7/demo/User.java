package com.litiantian.week7.demo;

package com.litiantian.pojo;
        package com.litiantian.model;

public class user {
    public class User {
        private  String ID;
        private  String name;
        private  String password;
        private  String Email;
        private  String Gender;
        private  String Birthdate;

        public void setID(String ID) {
            this.ID = ID;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public void setEmail(String email) {
            Email = email;
        }

        public void setGender(String gender) {
            Gender = gender;
        }

        public void setBirthdate(String birthdate) {
            Birthdate = birthdate;
        }

        public String getID() {
            return ID;
        }
        @@ -32,27 +56,15 @@ public String getBirthdate() {
            return Birthdate;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public void setEmail(String email) {
            Email = email;
        }

        public void setGender(String gender) {
            Gender = gender;
        }

        public void setBirthdate(String birthdate) {
            Birthdate = birthdate;
            @Override
            public String  toString() {
                return "User{" +
                        "ID='" + ID + '\'' +
                        ", name='" + name + '\'' +
                        ", password='" + password + '\'' +
                        ", Email='" + Email + '\'' +
                        ", Gender='" + Gender + '\'' +
                        ", Birthdate='" + Birthdate + '\'' +
                        '}';
            }
        }