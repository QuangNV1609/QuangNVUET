package Diractory;

public class DictionaryCommandLine {
    private static DictionaryManagement management = new DictionaryManagement();

    public void dictionaryBasic() {
        int choice = 0;
        do {
            System.out.println("1-Nhập");
            System.out.println("2-Xuất");
            System.out.println("3-Thoát");
            switch (choice){
                case 1:
                    management.insertFromCommandline();
                    break;
                case 2:
                    management.showAllWords();
                    break;
                case 0:
                    break;
                default:
                    break;
            }
        }while (choice != 0);
    }
}
