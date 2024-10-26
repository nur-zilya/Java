//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int vasyaAge = 36;
        int katyaAge = 36;
        int mishaAge = 17;

        int min = -1; // минимальный возраст
        int middle = -1; // средний возраст
        int max = -1; // максимальный возраст

        if (vasyaAge < katyaAge && vasyaAge < mishaAge) {
            min = vasyaAge;
         if (katyaAge < mishaAge) {
                middle = katyaAge;
                max = mishaAge;
            } else {
             middle = mishaAge;
             max = katyaAge;
         }
        } else if (katyaAge < vasyaAge && katyaAge < mishaAge) {
            min = katyaAge;
            if (vasyaAge < mishaAge) {
                middle = vasyaAge;
                max = mishaAge;
            } else {
                middle = mishaAge;
                max = vasyaAge;
            }
        } else if (vasyaAge == katyaAge){
            if (vasyaAge == katyaAge && vasyaAge == mishaAge || vasyaAge < mishaAge){
                min = vasyaAge;
                middle = katyaAge;
                max = mishaAge;
            } else if (vasyaAge == katyaAge && mishaAge < vasyaAge) {
                min = mishaAge;
                middle = katyaAge;
                max = vasyaAge;
            }
        } else if (katyaAge == mishaAge) {
            if (katyaAge == vasyaAge && katyaAge == mishaAge || katyaAge < vasyaAge) {
                min = mishaAge;
                middle = katyaAge;
                max = vasyaAge;
            } else if (mishaAge == katyaAge && vasyaAge < katyaAge) {
                min = vasyaAge;
                middle = katyaAge;
                max = mishaAge;
            }
        }
        else if (vasyaAge == mishaAge) {
            if (vasyaAge == katyaAge && katyaAge == mishaAge || katyaAge < vasyaAge) {
                min = katyaAge;
                middle = mishaAge;
                max = vasyaAge;
            } else  {
                min = vasyaAge;
                middle = mishaAge;
                max = katyaAge;
            }
        }
        else {
                min = mishaAge;
                if (vasyaAge < katyaAge){
                    min = vasyaAge;
                    max = katyaAge;
            } else {
                    min = katyaAge;
                    max = vasyaAge;
                }
        }
        System.out.println("Minimal age: " + min);
        System.out.println("Middle age: " + middle);
        System.out.println("Maximal age: " + max);
    }
}