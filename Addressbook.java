import java.util.ArrayList;
public class Addressbook {

    public ArrayList<Phonebook> pb = new ArrayList();
    public void Addressbook(){
        pb.add(new Phonebook("Петрова Анастасия Ивановна", "8904444444", "Волгоград"));
        pb.add(new Phonebook("Сергеев Павел Васильевич", "89053333333", "Обнинск"));
        pb.add(new Phonebook("Коростин Константин Витальевич", "896087055555", "Москва"));
    }

    public void showAddressBook(){
        for(Phonebook i : pb){
            System.out.println(i.getName() + " " + i.getPhone() + " " + i.getCity());
        }
    }
}