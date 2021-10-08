package HomeWork;

public class MainClass {
    public static void main(String[] args) {
        Personel igor = new Personel("Igor Kartashov", "igorek@mail.com",140,1000,35);
        igor.personelInfo();

        Personel [] persArray = new Personel[5];
        persArray[0] = new Personel("Ivanov Ivan","ivan@mail.com",128,2000,25);
        persArray[1] = new Personel("Petrova Nina","nina@mail.com",555,500,53);
        persArray[2] = new Personel("Kazanova Sveta","sveta@mail.com",958,9000,18);
        persArray[3] = new Personel("Grubov Pavel","pavel@mail.com",744,1000,40);
        persArray[4] = new Personel("Bosov Aleksey","boss@mail.com",888,25000,56);

        for (Personel p :persArray) {
            if (p.getAge()>40){
                p.personelInfo();
            }
        }

        Cat cat1 = new Cat(200,2,0);
        Cat cat2 = new Cat(150,3,0);
        cat1.run(150);
        cat1.jump(2);
        cat1.sail(15);
        cat2.run(300);
        cat2.jump(4);
        cat2.sail(15);
    }
}
