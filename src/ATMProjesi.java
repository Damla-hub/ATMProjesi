import java.util.Scanner;
public class ATMProjesi {
    public static void main(String[] args) {
        String userName,password;
        int right=3,total=1500;
        int select;
        while(right>0){
            Scanner inp =new Scanner(System.in);
            System.out.print("Lütfen kullanıcı adını giriniz:");
            userName=inp.nextLine();
            System.out.print("Lütfen şifreyi giriniz:");
            password=inp.nextLine();
            if((userName.equals("patika")) &&(password.equals("dev123"))){
                System.out.print("Merhaba! Kodluyoruz Bankasına hoşgeldiniz!");
                do {
                    System.out.println("\nLütfen yapmak isteidğiniz işlemi seçin:"+
                            "\n1-Para yatırma"+
                            "\n2-Para çekme"+
                            "\n3-Bakiye sorgulama"+
                            "\n4-Çıkış yap");
                    select=inp.nextByte();
                    switch(select){
                        case 1:
                            System.out.print("Yatırmak istediğiniz miktarı giriniz: ");
                            int add=inp.nextInt();
                            total+=add;
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz para miktarını giriniz: ");
                            int takeOut=inp.nextInt();
                            if(takeOut>total){
                                System.out.print("Yetersiz Bakiye!!!");
                            }else{
                                total-=takeOut;
                            }
                            break;
                        case 3:
                            System.out.print("Bakiyeniz:"+total+"TL'dir.");
                            break;
                    }
                }while(select!=4);
                System.out.println("Çıkış yaptınız.iyi günler =)");
                break;

            }else{
                right--;
                if(right!=0){
                    System.out.println("Hatalı giriş yaptınız.Lütfen tekrar deneyiniz.\nKalan giriş hakkınız:"+right);
                }
                else{
                    System.out.println("Hesabınız bloke oldu!");
                }

            }
        }

    }
}
