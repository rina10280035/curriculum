package study;

/**
 * User.java
 */
public class User {
    // フィールド変数
    private String userName;
    private int id;
    private String password;

    // コンストラクタ
    public User(String userName, int id, String password) {
        this.userName = "hoge";
        this.id = 123;
        this.password = "abc123";
    }


		// TODO 自動生成されたコンストラクター・スタブ


	public User() {
		// TODO 自動生成されたコンストラクター・スタブ
	}


	// ① 以下のルールに従いアカウント情報（名前、ID、パスワード）を出力するメソッドを作成してください。
    // アクセス修飾子:「protected」
    // メソッド名:「printAccountInfo」
    protected void printAccountInfo() {
    	System.out.println("名前は、" + this.userName);
    }
    protected void printAccountInfo1() {
    	System.out.println("IDは、" + this.id);
    }
    protected void printAccountInfo2() {
    	System.out.println("パスワードは、" +  this.password);
    }


		
	


	
	}



