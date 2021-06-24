public class CellPhone implements IPhone, IMailer, IComputer {
    public void callPhone() {
        System.out.println("電話をかける");
    }

    public void recievePhone() {
        System.out.println("電話を受ける");
    }

    public void sendMail() {
        System.out.println("メールを送信する");
    }

    public void receiveMail() {
        System.out.println("メールを受診する");
    }

    public void playGame() {
        System.out.println("3Dゲームをする");
    }

    public void browseWeb() {
        System.out.println("ウェブを閲覧する");
    }
}
