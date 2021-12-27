import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Account implements Comparable<Account> {
    private long id;
    private String fullName,username,password;
    private String email,phone,createAt;
    Account(){};
    public Account(long id, String fullName, String username, String password, String email, String phone, String createAt) {
        this.id = id;
        this.fullName = fullName;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.createAt = createAt;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }
    public void inPut()
    {
        Pattern pt=Pattern.compile("^[a-zA-Z0-9]{6,}$");
        Pattern pt2=Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*?&])[A-Za-z0-9@$!%*?&]{8,}$");
        Pattern ptemail=Pattern.compile("^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$");
        Pattern ptphone=Pattern.compile("^[0-9]{10,}$");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ID: "); id=sc.nextInt();
        sc.nextLine();
        System.out.println("enter fullname: "); fullName=sc.nextLine();
        do {
            System.out.println("enter username: "); username=sc.nextLine();
            System.out.println("enter password: "); password=sc.nextLine();
            if(!pt.matcher(username).find())
                 System.out.println("Invalid username");
            else if(!pt2.matcher(password).find())
                System.out.println("Invalid password");
            else
            {
                String newpass2;
                do {
                    System.out.println("re-enter new password");
                    newpass2 = sc.nextLine();
                    if(newpass2.compareTo(password)!=0)
                        System.out.println("Invalid");

                }
                while (newpass2.compareTo(password)!=0);
            }
        }
        while(!pt.matcher(username).find() ||!pt2.matcher(password).find());
        do {
            System.out.println("enter Email: ");
            email = sc.nextLine();
            if (!ptemail.matcher(email).find())
                System.out.println("Invalid email");
        }
        while(!ptemail.matcher(email).find());
        do {
            System.out.println("enter phonenumber: ");
            phone = sc.nextLine();
            if (!ptphone.matcher(phone).find())
                System.out.println("Invalid phone");
        }
        while (!ptphone.matcher(phone).find());

        Date date=new Date();
        SimpleDateFormat FM=new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
        createAt = FM.format(date);
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", createAt='" + createAt + '\'' +
                '}';
    }

    @Override
    public int compareTo(Account o) {
       return getUsername().compareTo(o.getUsername());
    }
}
