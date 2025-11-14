package kadai_021;

public class DictionaryExec_Chapter21 extends Dictionary_Chapter21{

	public static void main(String[] args) {
		
		// 辞書クラスのインスタンス作成
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		
		// 調べる英単語を配列にセット
		String[] words = {"apple", "banana", "grape", "orange"};
		
		// 配列の単語を順に辞書メソッドで検索
		for (String word : words) {
			String result = dictionary.lookup(word);
			
			if(result != null) {
				System.out.println(word + "の意味は" + result);
			} else {
				System.out.println(word + "は辞書に存在しません");
			}
		}
		
		// TODO 自動生成されたメソッド・スタブ
//		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
////		String[] searchWords = {"apple", "banana", "grape", "orange"};
//		
//		dictionary.search("apple");

	}

}
