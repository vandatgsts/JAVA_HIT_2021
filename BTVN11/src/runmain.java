import java.util.*;
import java.util.regex.Pattern;

public class runmain {

    public static List<Account> listUser = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public static Controller controller = new Controller();
    public static Pattern pt = Pattern.compile("^(?=.*[A-Za-z])(?=.*[0-9])[A-Za-z0-9]{6,}$");
    public static Pattern pt2 = Pattern.compile("^(?=.*[A-Za-z])(?=.*[0-9])(?=.*[@$!%*#?&]])[A-Za-z\\d@$!%*#?&]{8,}$");

    public static void main(String[] args) {
        controller.OpenFileToRead("ACC.DAT");
        while (true) {
            menu();
            System.out.println("enter choose: ");
            switch (sc.nextInt()) {
                case 1:
                {
                    CreatACC();
                }
                    break;
                case 2: {
                    Login();
                }
                    break;
                case 3:
                    SortAccount();
                    break;
                case 4:
                {
                    System.out.println("Exit");
                    controller.CloseFileAfterWrite();
                    System.exit(0);
                }
            }
        }
    }
    public static void SortAccount()
    {
        Collections.sort(listUser);
        for(Account a: listUser)
        {
            System.out.println(a.toString());
        }
    }
    public static void menu()
    {
        System.out.println("1. Create new account");
        System.out.println("2. Login to an existing account");
        System.out.println("3. Sort accounts by username");
        System.out.println("4. Exit");
    }
    public static void CreatACC()
    {
        Account a=new Account();
        a.inPut();
        if(checkID(a.getId())==false) {
            System.out.println("ID already exists ");
            return;
        }
        if(checkUserName(a.getUsername())==false)
        {System.out.println("username already exists ");
            return;
        }
        listUser.add(a);
        controller.WriteAccountToFile("ACC.DAT",a);
    }
    public static boolean checkID(long ID)
    {
        for(Account i : listUser)
        {
            if(i.getId()==ID) return false;
        }
        return true;
    }
    public static boolean checkUserName(String user)
    {
        for(Account i: listUser)
            if(i.getUsername().compareTo(user)==0) return false;
            return true;

    }
    public static void Login()
    {
        String mainUser,mainPassword;
        sc.nextLine();
        System.out.println("enter User: ");mainUser=sc.nextLine();
        System.out.println("enter password: "); mainPassword=sc.nextLine();
        if(checkLogin(mainUser,mainPassword))
        {
            while(true)
            { Account saveA=Save(mainUser,mainPassword);
                System.out.println("1. show info");
                System.out.println("2. change password");
                System.out.println("3. exit");
                System.out.println("enter choose");
                switch (sc.nextInt())
                {
                    case 1:
                    {
                        System.out.println(saveA.toString());
                    }break;
                    case 2:
                    {
                        changepassword(mainUser,mainPassword,saveA);
                    }break;
                    case 3:
                        return;

                }
            }
        }
    }
    public static void changepassword(String user,String Pass,Account a)
    {
        String oddpass;
        do {
            System.out.println("enter odd password: ");
          oddpass=sc.nextLine();
            if(oddpass.compareTo(Pass)!=0)
                System.out.println("Odd password is incorect, re-enter");

        }while (oddpass.compareTo(Pass)!=0);
        String newpass,newpass2;
        do {
            System.out.println("enter new password");
            newpass = sc.nextLine();

            if (newpass.compareTo(Pass) == 0)
                System.out.println("The new password is the same as the old password");
            else if (!pt2.matcher(newpass).find())
                System.out.println("Invalid password");
        }
        while (newpass.compareTo(Pass)== 0 || !pt2.matcher(newpass).find());
        do {
            System.out.println("re-enter new password");
            newpass2 = sc.nextLine();
           if(newpass2.compareTo(newpass)==0)
               System.out.println("Invalid");

        }
        while (newpass2.compareTo(newpass)==0);
        for(Account i: listUser)
        {
            if(i.getUsername().compareTo(user)==0 && i.getPassword().compareTo(Pass)==0)
                i.setPassword(newpass);
        }
        controller.UpdateAccountFile(listUser,"ACC.DAT");
        System.out.println("Change password success");


    }
//    public static void showinfo(String user,String pass)
//    {
//        List<Account> accout = controller.ReadAccountFromFile("ACC.DAT");
//        for(Account i: accout)
//            if(i.getUsername().compareTo(user)==0 && i.getPassword().compareTo(pass)==0) {
//                i.toString();
//                return;
//            }
//        return;
//    }
    public static boolean checkLogin(String user,String pass)
    {
        for(Account i : listUser)
            if(i.getUsername().compareTo(user)==0 && i.getPassword().compareTo(pass)==0)  return true;
            return false;
    }
    public static Account Save(String user, String pass)
    {
        List<Account> accout = controller.ReadAccountFromFile("ACC.DAT");

        for(Account i : accout)
            if(i.getUsername().compareTo(user)==0 && i.getPassword().compareTo(pass)==0) return i;
        return null;
    }

}