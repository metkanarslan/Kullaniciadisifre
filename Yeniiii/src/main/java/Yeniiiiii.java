import java.util.Scanner;

public class Yeniiiiii {
    public static void main(String[] args) {
        String userName,password,answer,newpw;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanı Adınız : ");
        userName=inp.nextLine();
        System.out.print("Şifreniz : ");
        password=inp.nextLine();
        if(userName.equals("patika")&&password.equals("java123")){
            System.out.println("Giriş Yaptınız");
        }else{
            password="java123";
            System.out.println("Bilgileriniz Yanlış !");
            System.out.print("Şifrenizi Sıfırlamak İster Misiniz : ");
            answer=inp.nextLine();
            if (answer.equals("evet")){
                System.out.print("Yeni Şifrenizi Giriniz : ");
                newpw=inp.nextLine();
                if (password.equals(newpw)){
                    System.out.print("Şifre Oluşturulamadı Lütfen Başka Şifre Giriniz :");
                    newpw=inp.nextLine();
                    password = newpw;
                    System.out.println("Şifre Oluşturuldu");
                }else{
                    password=newpw;
                    System.out.println("Şifre Oluşturuldu");
                }
            }
        }
    }

}
