public class Admin {
    private int id;
    private String admin_adi;
    private String admin_password;
    
    public Admin(int id, String admin_adi, String admin_password) {
        this.id = id;
        this.admin_adi = admin_adi;
        this.admin_password = admin_password;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdmin_adi() {
        return admin_adi;
    }

    public void setAdmin_adi(String admin_adi) {
        this.admin_adi = admin_adi;
    }

    public String getAdmin_password() {
        return admin_password;
    }

    public void setAdmin_password(String admin_password) {
        this.admin_password = admin_password;
    }

    
}
