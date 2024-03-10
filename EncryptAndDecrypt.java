import java.util.Scanner;

class EncryptAndDecrypt{
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int num=4;//this is now acts as an encryption key every character moves 4 position forward
     System.out.print("Enter any string you want(make sure the all the characters are in lowercase alphabets): ");
     String s=sc.nextLine(),a="";
     System.out.print("Given String: "+s);
     //Encryption part
     for(int i=0;i<s.length();i++){
     int j=(int) s.charAt(i)+num;
     if(j>122){
        j=j-26;
     }
     a=a+String.valueOf((char)j);
     }
     System.out.print("\nAfter Encryption: "+a);
     //Decryption part
     s="";
     for(int i=0;i<a.length();i++){
        int j=(int)a.charAt(i)-num;
        if(j<97){
            j=j+26;
        }
        s=s+String.valueOf((char)j);
     }
     System.out.println("\nAfter Decryption: "+s);
     sc.close();
    }
}