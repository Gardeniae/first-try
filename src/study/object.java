package study;

public class object {
    private String User_name;
    private String password;
    private String email;
    private String gender;
    private int age;

    public object() {
    }

    public object(String User_name, String password, String email, String gender, int age) {
        this.User_name = User_name;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    /**
     * 获取
     * @return User_name
     */
    public String getUser_name() {
        return User_name;
    }

    /**
     * 设置
     * @param User_name
     */
    public void setUser_name(String User_name) {
        this.User_name = User_name;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "object{User_name = " + User_name + ", password = " + password + ", email = " + email + ", gender = " + gender + ", age = " + age + "}";
    }
}
