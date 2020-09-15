package main.java.Arrays;

import java.util.ArrayList;

public class MobilePhone {

        private ArrayList<String> contactsName= new ArrayList<String>();
        private ArrayList<String> contactsNumber= new ArrayList<String>();
        Contacts contact= new Contacts();


        public void createContact(String name, String number){
                contact.createContact(name,number);

                contactsName.add(contact.getPersonName());
                contactsNumber.add(contact.getPersonMobNumber());

        }
        public void printcontact(){

            if(contactsName.size()>0) {
                System.out.println("You have "+contactsName.size()+" contacts \n");
                for (int i = 0; i < contactsName.size(); i++) {
                    System.out.print("Contact " + (i + 1) + " Name : " + contactsName.get(i) + "\n");
                    System.out.print("Contact " + (i + 1) + " Number : " + contactsNumber.get(i));
                    System.out.println("\n");
                }
            }else{
                System.out.println("You have 0 contacts");
            }

        }

        public void modifyContact(int index, String name, String number){
            int pos1=contactsName.indexOf(index);
            int pos2=contactsNumber.indexOf(index);
            contactsName.set(index,name);
            contactsNumber.set(index,number);
        }

        public void removeContact(int position){
            contactsName.remove(position);
            contactsNumber.remove(position);
        }

        public boolean findContact(String name){
            boolean isThere = contactsName.contains(name);
            return isThere;
            }

        public String getContactName(int index){
           return contactsName.get(index);
        }

        public String getContactNumber(int index){
            return contactsNumber.get(index);
        }

        public int findposition(String name){

            return contactsName.indexOf(name);
        }
        public void setContactName(int pos, String name){
            contactsName.set(pos,name);
        }
    public void setContactNumber(int pos, String name){
        contactsNumber.set(pos,name);
    }
}
