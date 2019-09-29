package es.upm.miw.iwvg.ecosystem.practice;

public class User {
    private int number;

    private String name;

    private String familyName;

    public User(int number, String name, String familyName) {
        this.number = number;
        this.name = this.format(name);

        this.familyName = this.format(familyName);
    }

    private String format(String string) {
        String name;
        name ="";
        if(string.indexOf(" ")!=-1){
            String[] a = string.split("\\ ");
            for (int i = 0; i<a.length; i++){
                name = name + a[i].trim().substring(0, 1).toUpperCase() + a[i].trim().substring(1).toLowerCase();
            }
            return name;
        }
        else return string.trim().substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
    }

    public String fullName() {
        return this.name + " " + this.familyName;
    }

    public String initials() {
        return this.name.substring(0, 1) + ".";
    }

    public String capitalName(){
        return this.name.toUpperCase();
    }

    public String fullName2() {
        return this.name.concat(this.familyName);
    }

    public int getNumber() {
        return this.number;
    }

    public String getName() {
        return this.name;
    }

    public String getFamilyName() {
        return this.familyName;
    }


}
